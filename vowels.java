class vowels{
    public static void main(String[] args){
        String a="helloworld";
        char[] arr={'a','e','i','o','u'};
        int count=0;
        char vowelcount=' ';
        
        for(char vowel:arr){
            int curr_count=0;

            for(int j=0;j<a.length();j++){
                if(vowel==a.charAt(j)){
                    curr_count++;
                }
            }

            if(curr_count > count){
                count=curr_count;
                vowelcount=vowel;
            }
        }
        System.out.println(vowelcount);
    }
}

// class vowels {
//     public static void main(String[] args) {
//         String a = "helloworld";
//         char[] arr = {'a', 'e', 'i', 'o', 'u'};
//         int maxCount = 0;
//         char highestVowel = ' ';

//         // Iterate over each vowel
//         for (char vowel : arr) {
//             int currCount = 0;

//             // Count occurrences of the current vowel in the string
//             for (int j = 0; j < a.length(); j++) {
//                 if (vowel == a.charAt(j)) {
//                     currCount++;
//                 }
//             }

//             // Update the highest count and vowel if the current vowel has more occurrences
//             if (currCount > maxCount) {
//                 maxCount = currCount;
//                 highestVowel = vowel;
//             }
//         }

//         System.out.println("The vowel with the highest count is: " + highestVowel);
//     }
// }
