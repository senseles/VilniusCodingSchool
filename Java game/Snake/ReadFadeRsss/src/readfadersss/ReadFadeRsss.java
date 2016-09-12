/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class ReadFadeRsss {
    ReadFadeRsss(){
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new ReadFadeRsss();
    }
    
    
    public String srtValueToEntity(int titleStartIndex, int titleEndIndex, String line, String description) {
        description = "<" + description + ">";
        String endDescription = "</" + description + ">";
        titleStartIndex = line.indexOf(description, titleEndIndex);
        if (titleStartIndex >= 0) {
            titleEndIndex = line.indexOf(endDescription, titleStartIndex);
            return line.substring(titleStartIndex + description.length(), titleEndIndex) + "\n";
        }
        return null;
    }

    public Feeds readRSSFeed(Feeds feeds) {
        try {
            URL rssUrl = new URL(feeds.getUrl());
            BufferedReader in = new BufferedReader(new InputStreamReader(rssUrl.openStream()));
           //http://www.vogella.com/tutorials/RSSFeed/article.html
            String line;
            while ((line = in.readLine()) != null) {
            	Items item = new Items();
                int titleEndIndex = 0;
                int titleStartIndex = 0;
             
                while (titleStartIndex >= 0) {
                    titleStartIndex = line.indexOf("<link>", titleEndIndex);
                    if (titleStartIndex >= 0) {
                        titleEndIndex = line.indexOf("</link>", titleStartIndex);
                        item.setLink(htmlCleaner(line.substring(titleStartIndex + "<link>".length(), titleEndIndex) + "\n"));
                    }
                    titleStartIndex = line.indexOf("<title>", titleEndIndex);
                    if (titleStartIndex >= 0) {
                        titleEndIndex = line.indexOf("</title>", titleStartIndex);
                        item.setTitle(htmlCleaner(line.substring(titleStartIndex + "<title>".length(), titleEndIndex) + "\n"));
                    }
                    titleStartIndex = line.indexOf("<pubDate>", titleEndIndex);
                    if (titleStartIndex >= 0) {
                        titleEndIndex = line.indexOf("</pubDate>", titleStartIndex);
                        item.setPublished(converDate(htmlCleaner(line.substring(titleStartIndex + "<pubDate>".length(), titleEndIndex) + "\n")));
                        feeds.getItem().add(item);
                    }
                }
            }
            in.close();

            return feeds;
        } catch (MalformedURLException ue) {
            System.out.println("Malformed URL");
        } catch (IOException ioe) {
            System.out.println("Something went wrong reading the contents");
        }
        return null;
    }
    
    public Date converDate(String strings) {
    	 DateFormat df = new SimpleDateFormat("E,dd MMM yyyy HH:mm:ss");
         Date d = new Date();
		try { 
			d = df.parse(strings.substring(0,strings.length()-7));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return d;
    }

    public String htmlCleaner(String parsedHtmlList) {
        String htmlFromList = parsedHtmlList;
        htmlFromList = htmlFromList.replace("<![CDATA[", "");
        htmlFromList = htmlFromList.replace("]]>", "");
        return htmlFromList;
    }
}
