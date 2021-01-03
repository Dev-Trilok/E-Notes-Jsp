/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Triloknath Nalawade
 */
public class saveDetails {
        private String Title, Content;

    public saveDetails(String Title, String Content) {
                super();
        this.Title = Title;
        this.Content = Content;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

        
        
}
