package com.akshay.composestudio.material.scroll

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.foundation.VerticalScroller
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.Divider
import androidx.ui.text.AnnotatedString
import androidx.ui.text.SpanStyle
import androidx.ui.text.TextStyle
import androidx.ui.text.font.FontFamily
import androidx.ui.text.font.FontStyle
import androidx.ui.text.font.FontWeight
import androidx.ui.text.style.TextAlign
import androidx.ui.text.style.TextDecoration
import androidx.ui.text.style.TextOverflow
import androidx.ui.unit.TextUnit
import androidx.ui.unit.dp
import androidx.ui.unit.sp

class TheScrollApp {
    @Composable
    fun LayoutContainer() {
        VerticalScroller {
            Column {
                TextLayout(mText = "Simple Text")
                TextLayout(
                        mText = "Text with bigger font size",
                        mTextStyle = TextStyle(
                                fontSize = 24.sp
                        )
                )
                TextLayout(
                        mText = "Text with Red color",
                        mTextStyle = TextStyle(
                                color = Color.Red
                        )
                )
                TextLayout(
                        mText = "Text in bold",
                        mTextStyle = TextStyle(
                                fontWeight = FontWeight.Bold
                        )
                )
                TextLayout(
                        mText = "Text in a cursive font family",
                        mTextStyle = TextStyle(
                                fontFamily = FontFamily.Cursive
                        )
                )
                TextLayout(
                        mText = "Text with Italic font style, restricted as maximum lines as one. " +
                                "Also Providing the padding of 24 density pixels to start, top and end od it. " +
                                "And the end, text will get overflowed and end with an ellipsis of 3 dots.",
                        mTextStyle = TextStyle(
                                fontStyle = FontStyle.Italic
                        ),
                        mMaxLines = 2,
                        mModifier = Modifier.padding(start = 24.dp, top = 24.dp, end = 24.dp),
                        mTextOverflow = TextOverflow.Ellipsis
                )

                Spacer(modifier = Modifier.padding(top = 8.dp))
                Divider(color = Color.LightGray)

                val mAnnotatedString = AnnotatedString {
                    append("The text has multi color property.")
                    addStyle(
                            style = SpanStyle(
                                    color = Color.LightGray
                            ),
                            start = 4,
                            end = 8
                    )
                    addStyle(
                            style = SpanStyle(
                                    color = Color.Blue
                            ),
                            start = 12,
                            end = 17
                    )
                }

                Text(text = mAnnotatedString, modifier = Modifier.padding(16.dp))

                Divider(color = Color.DarkGray)

                Row(modifier = Modifier.fillMaxWidth()) {
                    TextLayout(
                            mText = "Text with an underline",
                            mTextStyle = TextStyle(
                                    textDecoration = TextDecoration.Underline,
                                    background = Color.Cyan
                            )
                    )

                    TextLayout(
                            mText = "Text with letter spacing",
                            mTextStyle = TextStyle(
                                    textAlign = TextAlign.Center,
                                    color = Color.Green,
                                    letterSpacing = TextUnit.Companion.Em(2)
                            )
                    )
                }
            }
        }
    }

    @Composable
    fun TextLayout(
            mText: String,
            mTextStyle: TextStyle? = null,
            mMaxLines: Int? = null,
            mModifier: Modifier? = null,
            mTextOverflow: TextOverflow? = null
    ) {
        Text(
                text = mText,
                style = mTextStyle ?: TextStyle.Default,
                maxLines = mMaxLines ?: Int.MAX_VALUE,
                modifier = mModifier ?: Modifier.padding(32.dp),
                overflow = mTextOverflow ?: TextOverflow.Clip
        )
    }
}