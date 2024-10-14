public class Main {
     public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);

        int[] valores = {12, 25, 37, 41, 53, 64, 78, 89};
        for (int valor : valores) {
            hashTable.insert(valor);
        }
        
        hashTable.search(25); 
        hashTable.remove(37);  
        
        hashTable.printTable();
    }
}















