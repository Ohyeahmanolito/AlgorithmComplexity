/*x
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

import java.util.HashMap;

/**
 *
 * @author ITRO
 */
public class Demo {

    public static void main(String[] args) {

        HashMap<String, String> mp = new HashMap<>();
        mp.put("s", "ss");
        mp.put("s", "sdfsdfsdf");
        System.out.println(mp.get("n").hashCode());
        System.out.println(mp.get("s").hashCode());
        System.out.println(mp.get("s"));

    }
}
