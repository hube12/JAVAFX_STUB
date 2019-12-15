module Podcast_Collector {
    requires javafx.controls;
    requires javafx.fxml;
    
    opens edu.PCD.PodcastCollector to javafx.fxml;
    exports edu.PCD.PodcastCollector;
}
