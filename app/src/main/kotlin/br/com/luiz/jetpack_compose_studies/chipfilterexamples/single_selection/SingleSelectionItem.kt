package br.com.luiz.jetpack_compose_studies.chipfilterexamples.single_selection

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SingleSelectionItem(modifier: Modifier = Modifier) {
    val listItem =
        listOf(
            NameItemData(),
            NameItemData(),
            NameItemData(),
            NameItemData(),
        )

    val nameItemDataState = remember { NameItemDataState() }
    nameItemDataState.setNameList(listItem)

    LazyRow(
        modifier = modifier
            .padding(horizontal = 12.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
    ) {
        items(nameItemDataState.nameItemList, key = { it.itemId }) { nameItemData ->
            NameComponent(nameItemData, onItemSelected = {
                nameItemDataState.onItemSelected(it)
            })
        }
    }
}
