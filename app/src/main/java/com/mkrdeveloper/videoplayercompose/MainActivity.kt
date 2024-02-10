package com.mkrdeveloper.videoplayercompose

import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.unit.dp
import com.mkrdeveloper.videoplayercompose.ui.theme.VideoPlayerComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VideoPlayerComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    /* val videoUri =
                         Uri.parse("android.resource://com.mkrdeveloper.videoplayercompose/raw/sample")*/
                    val videoUrl =
                        "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"

                    Column {
                        /*YouTubePlayer(
                            youtubeVideoId = "kShAS6aafOU",
                            lifecycleOwner = LocalLifecycleOwner.current
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        VideoPlayer(videoUri =videoUri)*/
                        VideoPlayerExo(videoUrl =videoUrl)
                    }

                }
            }
        }
    }
}

