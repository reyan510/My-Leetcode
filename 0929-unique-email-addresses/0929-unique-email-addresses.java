class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> unique_Email = new HashSet<>();
        
        for(String email: emails){
            int pos = email.indexOf("@");
            String localname = email.substring(0, pos);
            String domainname = email.substring(pos);
            
            if(localname.contains("+")){
                int split = localname.indexOf("+");
                localname = localname.substring(0, split);
            }
            
            localname = localname.replaceAll("\\.","");
            String newname = localname + domainname;
            unique_Email.add(newname);
        }
        
        return unique_Email.size();
    }
}