/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pikatweet;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.Query;
import com.firebase.client.ValueEventListener;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Macbook-Air
 */
public class Database {
    
    Firebase ref = new Firebase("https://radiant-fire-6490.firebaseio.com/posts");
    
    public static void main(String[] args) throws InterruptedException{
    
    Firebase ref = new Firebase("https://radiant-fire-6490.firebaseio.com/posts");
    
    Firebase postsRef = ref.child("Adeel");
    
    
    
    Map<String,Object> post = new HashMap<>();
    
    post.put("9","test");
    
    
    postsRef.updateChildren(post);
    
    
    
    
    
    
    ArrayList values = new ArrayList();
    
    
    
    ref.addValueEventListener(new ValueEventListener() {
    @Override
    public void onDataChange(DataSnapshot snapshot) {
        
        
        System.out.println(snapshot.getValue());
        
        
        
    }
    @Override
    public void onCancelled(FirebaseError firebaseError) {
        System.out.println("The read failed: " + firebaseError.getMessage());
    }
    });
    
    
    
    
    Thread.sleep(4000);
    }
    
    
    
}
        

    
    
    



