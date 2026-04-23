package org.APCSLowell;

// FRQ: https://secure-media.collegeboard.org/digitalServices/pdf/ap/ap16_frq_computer_science_a.pdf
public class RandomStringChooser {
    private ArrayList<String> vals;
    public RandomStringChooser(String[] values){
        vals = new ArrayList<String>();
        for(String val : values){
            vals.add(val);
        }
    }
    public String getNext(){
        if(vals.size()==0){
            return "NONE";
        }
        return vals.remove((int) (Math.random()*vals.size()));
    }
}
