package br.com.luiz.jetpack_compose_studies

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.luiz.jetpack_compose_studies.navigation.NavGraph
import br.com.luiz.jetpack_compose_studies.ui.theme.JetpackComposeStudiesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeStudiesTheme {
                Scaffold(
                    topBar = { },
                    content = {
                        Surface(
                            modifier =
                            Modifier
                                .padding(it)
                                .fillMaxSize(),
                            color = MaterialTheme.colorScheme.background,
                        ) {
                            Greeting(
                                modifier = Modifier.padding(top = 30.dp, start = 50.dp),
                                name = "Android",
                            )
                            NavGraph()
                        }
                    },
                    bottomBar = { },
                )
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeStudiesTheme {
        Greeting("Android")
    }
}