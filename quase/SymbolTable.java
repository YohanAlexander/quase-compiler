package quase;

import quase.node.*;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class SymbolTable {

    /*
    @Override
	public int LinkedHashMap.hashCode(char* key)
    {
        int temp = 0;
        int i = 0;
        while(key[i] != '\0'){
            temp = ((temp << 4) + key[i]) % SIZE;
        }
        return temp;
    }
    */

    LinkedHashMap<node, int> table = new LinkedHashMap<node, int>();

    LinkedList<table> tables = new LinkedList<table>();




}
