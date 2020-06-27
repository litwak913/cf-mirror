
package io.github.litwak913.gson;


public class Authors {

    private String name;
    private String url;
    private int projectId;
    private int id;
    private String projectTitleId;
    private String projectTitleTitle;
    private long userId;
    private long twitchId;
    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setUrl(String url) {
         this.url = url;
     }
     public String getUrl() {
         return url;
     }

    public void setProjectId(int projectId) {
         this.projectId = projectId;
     }
     public int getProjectId() {
         return projectId;
     }

    public void setId(int id) {
         this.id = id;
     }
     public int getId() {
         return id;
     }

    public void setProjectTitleId(String projectTitleId) {
         this.projectTitleId = projectTitleId;
     }
     public String getProjectTitleId() {
         return projectTitleId;
     }

    public void setProjectTitleTitle(String projectTitleTitle) {
         this.projectTitleTitle = projectTitleTitle;
     }
     public String getProjectTitleTitle() {
         return projectTitleTitle;
     }

    public void setUserId(long userId) {
         this.userId = userId;
     }
     public long getUserId() {
         return userId;
     }

    public void setTwitchId(long twitchId) {
         this.twitchId = twitchId;
     }
     public long getTwitchId() {
         return twitchId;
     }

}