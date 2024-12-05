public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };

        
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }
    

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for(int i=0;i<sentences.length;i++){
            String sen = sentences[i];
            String[] words = sen.split(" ");
            int count = 0;
            for(int l=0;l<words.length;l++){
                if(equal(words[l], keywords)){
                    count++; 
                }
            }
            if(count != 0){
                System.out.println(sentences[i]);
            }
        }
    }


    public static boolean equal(String str, String[] keywords) {
        for(int l=0;l<keywords.length;l++){
            keywords[l] = keywords[l].toLowerCase();
        }
        str = str.toLowerCase();
        for(int i=0;i<keywords.length;i++){
            String str2 = keywords[i];
            int count = 0;
            if(str.length() == str2.length()){

            
                for(int j=0;j<str.length();j++){

                    if(str.charAt(j) == str2.charAt(j)){
                        count++;
                    }
                }
                if(count == str.length()){
                    return true;
                }
            }

        }
        return false;
        }
}
