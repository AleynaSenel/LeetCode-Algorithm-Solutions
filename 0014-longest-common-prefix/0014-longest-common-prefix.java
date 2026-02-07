class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        List<char[]> kelimeDizisi = new ArrayList<>();
        List<String> ayniHarfler = new ArrayList<>();
        
        for(String kelime : strs){

            char[] karakterDiziOlusturma = kelime.toCharArray();
            kelimeDizisi.add(karakterDiziOlusturma);     
        }
        


        // burada her karakterin harf dizisini aldık. şimdi karşılaştırma
        // kelimeDizisi[0] = ["d","o","g"]   kelimeDizisi[1] = ["d","o","n","u","t"]
       int enKisaBoyut = kelimeDizisi.get(0).length;
       int enKisaIndex = 0; 


        for (int i = 1; i < kelimeDizisi.size(); i++) {
            
            if (kelimeDizisi.get(i).length < enKisaBoyut) {
                
                enKisaBoyut = kelimeDizisi.get(i).length; 
                enKisaIndex = i;                         
            }
        }
       

       for(int i=0; i<enKisaBoyut; i++){

        char referansHarf = kelimeDizisi.get(enKisaIndex)[i];
        boolean herkesAyniMi = true;

            for(int j = 0 ; j< kelimeDizisi.size() ; j++){
                if(kelimeDizisi.get(j)[i] != referansHarf){

                    herkesAyniMi = false;
                    break; 
                }
               
            }

            if(herkesAyniMi){
                ayniHarfler.add(String.valueOf(referansHarf));
            } else {
                
                break;
            }
       }
        String sonuc = String.join("",ayniHarfler);
        return sonuc;
    }



}