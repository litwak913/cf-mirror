
package io.github.litwak913.gson;
import java.util.Date;

public class SortableGameVersion {

    private String gameVersionPadded;
    private Date gameVersion;
    private Date gameVersionReleaseDate;
    private Date gameVersionName;
    public void setGameVersionPadded(String gameVersionPadded) {
         this.gameVersionPadded = gameVersionPadded;
     }
     public String getGameVersionPadded() {
         return gameVersionPadded;
     }

    public void setGameVersion(Date gameVersion) {
         this.gameVersion = gameVersion;
     }
     public Date getGameVersion() {
         return gameVersion;
     }

    public void setGameVersionReleaseDate(Date gameVersionReleaseDate) {
         this.gameVersionReleaseDate = gameVersionReleaseDate;
     }
     public Date getGameVersionReleaseDate() {
         return gameVersionReleaseDate;
     }

    public void setGameVersionName(Date gameVersionName) {
         this.gameVersionName = gameVersionName;
     }
     public Date getGameVersionName() {
         return gameVersionName;
     }

}