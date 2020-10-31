/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lab7.analytics.DataStore;

/**
 *
 * @author harshalneelkamal
 */
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private List<Comment> comments;

    public User(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.comments = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "User{" + "id = " + id + ", firstName = " + firstName + ", lastName = " + lastName + ", no. of comments = " + comments.size() + '}';
    }
    
    public int getTotalPostsPerUser(){
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        int total = 0;
        for(Post p : posts.values()){
            if(p.getUserId() == id){
                total += 1;
            }      
        }
        return total;
    }

    
    public int getTotalCommentsPerUser(){
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        int total = 0;
        for(Comment c : comments.values()){
            if(c.getUserId() == id){
                total += 1;
            }      
        }
        return total;
    }
    
    public int getTotalLikesPerUser(){
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        int totalLike = 0;
        for(Comment c : comments.values()){
            if(c.getUserId() == id){
                totalLike += c.getLikes();
            }      
        }
        return totalLike;
    }

    
}
