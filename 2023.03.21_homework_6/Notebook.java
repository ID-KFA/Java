public class Notebook {
    int memory;
    int hdd;
    String OS;
    String color;

    // public Notebook(int memory, int hdd, String OS, String color) {
    //     this.memory = memory;
    //     this.hdd = hdd;
    //     this.OS = OS;
    //     this.color = color;
    // }
    
    public int getMemory(){
        return memory;
    }
    public int getHDD(){
        return hdd;
    }

    public String getOS(){
        return OS;
        
    }

    public String getColor(){
        return color;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Notebook RAM "+memory+" GB"+" HDD "+hdd+" GB "+ OS+" "+ color;
    }


}
