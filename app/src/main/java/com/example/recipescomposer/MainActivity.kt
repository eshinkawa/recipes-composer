package com.example.recipescomposer

import android.os.Bundle
import androidx.animation.transitionDefinition
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.State
import androidx.ui.animation.ColorPropKey
import androidx.ui.animation.Crossfade
import androidx.ui.animation.DpPropKey
import androidx.ui.animation.Transition
import androidx.ui.core.Modifier
import androidx.ui.core.setContent
import androidx.ui.foundation.Box
import androidx.ui.foundation.Text
import androidx.ui.foundation.VerticalScroller
import androidx.ui.foundation.drawBackground
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.*
import androidx.ui.text.TextStyle
import androidx.ui.text.style.TextAlign
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import com.example.recipescomposer.ui.typography

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme() {
                Greeting("EduardoS", color = Color.Red)
            }
        }
    }
}

val colorKey = ColorPropKey()
val widthKey = DpPropKey()
val heightKey = DpPropKey()

//val definition = transitionDefinition {
//    state(name = "First") {
//        this[colorKey] = Color.Red
//        this[widthKey] = 200.dp
//        this[heightKey] = 400.dp
//    }
//    state(name = "Second") {
//        this[colorKey] = Color.Green
//        this[widthKey] = 300.dp
//        this[heightKey] = 300.dp
//    }
//}
//
//@Composable
//fun TransitionBasedColoredRect() {
//    // This puts the transition in State.First. Any subsequent state change will trigger a
//    // transition animation, as defined in the transition definition.
//    Transition(definition = definition, toState = "First") { state ->
//        Box(
//                Modifier
//                        .preferredSize(state[widthKey], state[heightKey])
//                        .drawBackground(state[colorKey])
//        )
//    }
//}
//
//@Composable
//fun ColorRectWithInitState() {
//    // This starts the transition going from State.First to State.Second when this composable
//    // gets composed for the first time.
//    Transition(definition = definition, initState = "First", toState = "Second) {
//        state ->
//        Box(
//                Modifier
//                        .preferredSize(state[], state[heightKey])
//                        .(state[colorKey])
//        )
//    }
//}

@Composable
fun Greeting(name: String, color: Color) {
    Surface(color = color, modifier = Modifier.padding(4.dp)) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Text(text = "Hello ${name}", color = Color.White, modifier = Modifier.padding(12.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MaterialTheme {
        Scaffold(topAppBar = {
            TopAppBar(
                    title = { Text(text = "AppBar") },
                    backgroundColor = Color(0xFF29335c),
                    contentColor = Color.White
            )
        }) {
            VerticalScroller() {
                Column(modifier = Modifier.fillMaxHeight()) {
                    Surface(color = Color(0xFFdb2b39), modifier = Modifier.fillMaxHeight()) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Greeting("Eduardos", color = Color(0xFFF3a712));
                            Greeting("Jeremias", color = Color(0xFFF0cea0));
                            Greeting("Renzo", color = Color(0xFF534d41));
                            Greeting("Eduardos", color = Color(0xFFF3a712));
                            Greeting("Jeremias", color = Color(0xFFF0cea0));
                            Greeting("Renzo", color = Color(0xFF534d41));
                            Greeting("Eduardos", color = Color(0xFFF3a712));
                            Greeting("Jeremias", color = Color(0xFFF0cea0));
                            Greeting("Renzo", color = Color(0xFF534d41));
                            Greeting("Eduardos", color = Color(0xFFF3a712));
                            Greeting("Jeremias", color = Color(0xFFF0cea0));
                            Greeting("Renzo", color = Color(0xFF534d41));
                            Greeting("Eduardos", color = Color(0xFFF3a712));
                            Greeting("Jeremias", color = Color(0xFFF0cea0));
                            Greeting("Renzo", color = Color(0xFF534d41));
                            Greeting("Eduardos", color = Color(0xFFF3a712));
                            Greeting("Jeremias", color = Color(0xFFF0cea0));
                            Greeting("Renzo", color = Color(0xFF534d41));
                        }
                    }
                }
            }


        }
    }
}