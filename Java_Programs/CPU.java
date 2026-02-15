//Create a class CPU with attribute price. Create an inner class Processor(no of cores, manufacturer) and a static method class RAM(memory, manufacturer) inside CPU. 
// Create an object of CPU and print details of its processor and RAM.
class CPU{
    int price;
    CPU(int price){
        this.price=price;
    }
    class Processor{
        int cores;
        String manufacturer;
        Processor(int cores,String manufacturer){
            this.cores=cores;
            this.manufacturer=manufacturer;
        }
        void display(){
            System.out.println("Processor details:");
            System.out.println("Cores: "+cores);
            System.out.println("Manufacturer: "+manufacturer);
        }
    }
    static class RAM{
        int memory;
        String manufacturer;
        RAM(int memory,String manufacturer){
            this.memory=memory;
            this.manufacturer=manufacturer;
        }
        void display(){
            System.out.println("RAM details:");
            System.out.println("Memory: "+memory+" GB");
            System.out.println("Manufacturer: "+manufacturer);
        }
    }
    public static void main(String args[]){
        CPU cpu = new CPU(500);
        System.out.println("CPU Price: "+cpu.price);
        CPU.Processor processor = cpu.new Processor(8,"Intel");
        processor.display();
        CPU.RAM ram = new CPU.RAM(16,"Corsair");
        ram.display();
    }
}