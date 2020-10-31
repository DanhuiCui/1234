/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

/**
 *
 * @author harshalneelkamal
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;


public class AnalysisHelper {
    //Find Average number of likes per comment.
    //TODO
    public void getAverageLikesPerCommets() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        int likeNumber = 0;
        int commentNumber = comments.size();
        for (Comment c : comments.values()) {
            likeNumber += c.getLikes();
        }
        
        System.out.println("average of likes per comments: " + likeNumber / commentNumber);
        
            
    }
    
    public int getPostWithMostLikedComment(){
       Map<Integer, Comment> comments = DataStore.getInstance().getComments();
       Set<Map.Entry<Integer, Comment>> set = comments.entrySet();
       int flagKey = 0;
       int maxlike = 0;
       for (Map.Entry<Integer, Comment> entry : set) {
           int key = entry.getKey();
           Comment value =  entry.getValue();
           if(maxlike < value.getLikes()) {
               flagKey = key;
               maxlike = value.getLikes();
           }
       }
       return comments.get(flagKey).getPostId();
    }
    
    public void getPostWithMostComments(){
        Map<Integer, Post> users = DataStore.getInstance().getPosts();
        List<Post> list = new ArrayList();
        for(Post p:users.values()){
            list.add(p);
        }
        Comparator<Post> postCompare = new Comparator<Post>(){
            @Override
            public int compare(Post p1,Post p2){
                return Integer.compare(p2.getTotalCommentsPerPostID(), p1.getTotalCommentsPerPostID());
            }
        };
        Collections.sort(list, postCompare);
        
        System.out.println("PostID of posts with most comments: "+list.get(1).getPostId()+"  Total of comments->"+list.get(1).getTotalCommentsPerPostID());
        
    }
    
    public void getTop5UsersWithPosts(){
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        List<User> list = new ArrayList();
        for(User u:users.values()){
            list.add(u);
        }
        Comparator<User> userCompare = new Comparator<User>(){
            @Override
            public int compare(User u1,User u2){
                return Integer.compare(u1.getTotalPostsPerUser(), u2.getTotalPostsPerUser());
            }
        };
        Collections.sort(list, userCompare);
        for(int i=0;i<5;i++){
            System.out.println("Top 5 users based on posts: Users->"+list.get(i).getId()+"  Total post numbers->"+list.get(i).getTotalPostsPerUser());
        }
    }
        
        public void getTop5UsersWithComments(){
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        List<User> list = new ArrayList();
        for(User u:users.values()){
            list.add(u);
        }
        Comparator<User> userCompare = new Comparator<User>(){
            @Override
            public int compare(User u1,User u2){
                return Integer.compare(u1.getTotalCommentsPerUser(), u2.getTotalCommentsPerUser());
            }
        };
        Collections.sort(list, userCompare);
        for(int i=0;i<5;i++){
            System.out.println("Top 5 users based on comments: User->"+list.get(i).getId()+"  Total commnet numbers->"+list.get(i).getTotalCommentsPerUser());
        }
    }
        
        public void getTop5InactiveUsers(){
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        List<User> list = new ArrayList();
        for(User u:users.values()){
            list.add(u);
        }
        Comparator<User> userCompare = new Comparator<User>(){
            @Override
            public int compare(User u1,User u2){
                int user1 = u1.getTotalPostsPerUser()+u1.getTotalCommentsPerUser()+u1.getTotalLikesPerUser();
                int user2 = u2.getTotalPostsPerUser()+u2.getTotalCommentsPerUser()+u2.getTotalLikesPerUser();
                return Integer.compare(user1, user2);
            }
        };
        Collections.sort(list, userCompare);
        for(int i=0;i<5;i++){
            int sum = list.get(i).getTotalPostsPerUser()+list.get(i).getTotalCommentsPerUser()+list.get(i).getTotalLikesPerUser();
            System.out.println("Top 5 inactive users: User->"+list.get(i).getId()+"  Post->"+list.get(i).getTotalPostsPerUser()+"  Comment->"+list.get(i).getTotalCommentsPerUser()+""
                    + "  Like->"+list.get(i).getTotalLikesPerUser()+"  Sum->"+sum);
        }
        
    }
        public void getTop5ProactiveUsers(){
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        List<User> list = new ArrayList();
        for(User u:users.values()){
            list.add(u);
        }
        Comparator<User> userCompare = new Comparator<User>(){
            @Override
            public int compare(User u2,User u1){
                int user1 = u1.getTotalPostsPerUser()+u1.getTotalCommentsPerUser()+u1.getTotalLikesPerUser();
                int user2 = u2.getTotalPostsPerUser()+u2.getTotalCommentsPerUser()+u2.getTotalLikesPerUser();
                return Integer.compare(user1, user2);
            }
        };
        Collections.sort(list, userCompare);
        for(int i=0;i<5;i++){
            int sum = list.get(i).getTotalPostsPerUser()+list.get(i).getTotalCommentsPerUser()+list.get(i).getTotalLikesPerUser();
            System.out.println("Top 5 inactive users: User->"+list.get(i).getId()+"  Post->"+list.get(i).getTotalPostsPerUser()+"  Comment->"+list.get(i).getTotalCommentsPerUser()+""
                    + "  Like->"+list.get(i).getTotalLikesPerUser()+"  Sum->"+sum); 
        }
        
    }
    
    
    
   
    
    
    
}
