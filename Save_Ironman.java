class Save_Ironman {

    // Function for finding maximum and value pair
    public static boolean saveIronman(String s) {
        // int n = s.length();
        // StringBuilder sb=new StringBuilder(s);
        // for(int i=0;i<n;i++){
        // if(s.equals(sb.reverse().toString())){
        // return true;
        // }
        // }
        // return false;

        // s = s.toLowerCase();
        // s = s.replaceAll("[^a-zA-Z0-9]","");
        // int i=0, j=s.length()-1;
        // while(i < j) {
        // if(s.charAt(i++) != s.charAt(j--))
        // return false;
        // }
        // return true;

        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        String str = s;
        StringBuilder sb = new StringBuilder(s);
        if (str.equals(sb.reverse().toString())) {
            return true;
        }
        return false;
    }

}
