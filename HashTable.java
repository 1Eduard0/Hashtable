public class HashTable {
    private int [] table;
    private int size;

    public HashTable (int size) {
        this.size = size;
        this.table = new int[size];
        for (int i = 0; i < size; i++) {
            table[i] = 0;
        }
    } 

    public int HashFunction(int key){
        return key % 10;
    }

    public void insert(int key) {
        int index = HashFunction(key);
        table[index] = key;
        System.out.println("Inserido " + key + " na posição " + index);
    }

    public boolean search(int key) {
        int index = HashFunction(key);
        if (table[index] == key) {
            System.out.println("Chave " + key + " encontrada na posição " + index);
            return true;
        } else {
            return false;
        }
        
    }
    public void remove(int key) {
        int index = HashFunction(key);
        if (table[index] == key) {
            table[index] = 0;
            System.out.println("Removendo a chave " + key);
        } else {
            System.out.println("Chave não encontrada.");
        }
    }

    public void printTable() {
        System.out.println("HASHTABLE:");
        for (int i = 0; i < size; i++) {
            System.out.println("Posição " + i + ": " + table[i]);
        }
    }
    
}