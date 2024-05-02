package br.com.luiz.jetpack_compose_studies.chipfilterexamples.single_selection

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun NameComponent(
    item: NameItemData,
    onItemSelected: (NameItemData) -> Unit,
) {
    Card(
        modifier = Modifier.size(width = 100.dp, height = 40.dp),
        border = if (item.isSelected) BorderStroke(2.dp, Color.Red) else null,
    ) {
        Box(
            modifier =
                Modifier
                    .fillMaxSize()
                    .clickable {
                        onItemSelected(item.copy(isSelected = item.isSelected.not()))
                    },
            contentAlignment = Alignment.Center,
        ) {
            Text(text = item.name)
        }
    }
}
