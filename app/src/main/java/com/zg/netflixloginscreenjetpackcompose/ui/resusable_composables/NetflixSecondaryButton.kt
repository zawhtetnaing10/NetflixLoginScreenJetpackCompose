package com.zg.netflixloginscreenjetpackcompose.ui.resusable_composables

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zg.netflixloginscreenjetpackcompose.ui.theme.NetflixCloneJetpackComposeTheme
import com.zg.netflixloginscreenjetpackcompose.ui.theme.NetflixGrey
import com.zg.netflixloginscreenjetpackcompose.ui.theme.NetflixSansFontFamily
import com.zg.netflixloginscreenjetpackcompose.ui.theme.White

@Composable
fun NetflixSecondaryButton(label: String, onTapButton: () -> Unit, modifier: Modifier = Modifier) {
    Button(
        onClick = onTapButton,
        shape = RoundedCornerShape(8.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = NetflixGrey
        ), modifier = modifier
            .fillMaxWidth()
            .height(48.dp)
    ) {
        Text(
            label, style = TextStyle(
                color = White, fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = NetflixSansFontFamily
            )
        )
    }
}

@Preview
@Composable
private fun NetflixSecondaryButtonPreview() {
    NetflixCloneJetpackComposeTheme {
        NetflixSecondaryButton(label = "Use a sign-in code", onTapButton = {})
    }
}