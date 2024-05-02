package br.com.luiz.jetpack_compose_studies.chipfilterexamples.chip

import android.graphics.Color.parseColor
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ChipFilterScreen(
    chipList: List<String> = listOf(
        "Android",
        "Flutter",
        "React Native",
        "Kotlin",
        "Java",
    ), navigateBack: () -> Unit
) {
    var selected by remember { mutableStateOf("") }
    LazyRow(
        modifier = Modifier
            .padding(top = 70.dp)
            .fillMaxWidth()
    ) {
        items(chipList) { chip ->
            Chip(title = chip, selected = selected, onSelected = {
                selected = it
            })
        }
    }
}

@Composable
fun Chip(title: String, selected: String, onSelected: (String) -> Unit) {
    val isSelected = selected == title
    val backgroundColor = if (isSelected) "#6650a4" else "#f1f1f1"
    val textColor = if (isSelected) "#f1f1f1" else "#000000"
    Box(modifier = Modifier
        .padding(10.dp)
        .height(35.dp)
        .clip(CircleShape)
        .background(color = Color(parseColor(backgroundColor)))
        .clickable {
            onSelected(title)
        }) {
        Row(
            modifier = Modifier.padding(start = 10.dp, end = 10.dp, top = 5.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            AnimatedVisibility(visible = isSelected) {
                Icon(
                    imageVector = Icons.Filled.Check,
                    contentDescription = "Check",
                    tint = Color.White
                )
            }
            Text(text = title, color = Color(parseColor(textColor)))
        }
    }
}
