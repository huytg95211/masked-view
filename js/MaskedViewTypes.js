// @flow
import { type Node, type Element } from 'react'
import { ViewPropTypes } from 'react-native'

export type MaskedViewProps = typeof ViewPropTypes &
  $ReadOnly<{|
    children: Node,
    /**
     * Should be a React element to be rendered and applied as the
     * mask for the child element.
     */
    maskElement: Element<any>,
    /**
     * Opt into software rendering to enable animated masks.
     */
    androidRenderingMode?: 'software' | 'hardware',
    /**
     * Update PorterDuff.Mode on android: https://developer.android.com/reference/android/graphics/PorterDuff.Mode
     */
    androidPorterDuffMode?: 'SRC_ATOP' | 'SRC_IN',
  |}>
