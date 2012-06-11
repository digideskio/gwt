/*
 * Copyright 2012 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package elemental.svg;

import elemental.events.*;
import elemental.util.*;
import elemental.dom.*;
import elemental.html.*;
import elemental.css.*;
import elemental.stylesheets.*;

import java.util.Date;

/**
  * The pixel value of an input image i2 is used to displace the original image i1.
  */
public interface SVGFEDisplacementMapElement extends SVGElement, SVGFilterPrimitiveStandardAttributes {

    static final int SVG_CHANNEL_A = 4;

    static final int SVG_CHANNEL_B = 3;

    static final int SVG_CHANNEL_G = 2;

    static final int SVG_CHANNEL_R = 1;

    static final int SVG_CHANNEL_UNKNOWN = 0;

  SVGAnimatedString getIn1();

  SVGAnimatedString getIn2();

  SVGAnimatedNumber getScale();

  SVGAnimatedEnumeration getXChannelSelector();

  SVGAnimatedEnumeration getYChannelSelector();
}