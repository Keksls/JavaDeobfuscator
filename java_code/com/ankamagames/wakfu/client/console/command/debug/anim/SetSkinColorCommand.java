/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.debug.anim;

import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class SetSkinColorCommand
implements avt_0 {
    private static final Logger a = Logger.getLogger(SetSkinColorCommand.class);
    private static final TIntObjectHashMap<float[]> b = new TIntObjectHashMap();

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        Object[] objectArray;
        float[] fArray;
        bmr_1 bmr_12 = azu_0.j().k();
        int n = arrayList.size();
        if (n != 3 && n != 4) {
            return;
        }
        if (bmr_12 == null) {
            aVo.a().d("pas de localPlayer");
            return;
        }
        biI biI2 = bmr_12.bv();
        String string = arrayList.get(2);
        int n2 = Anm.b(string);
        if (n2 == 0) {
            return;
        }
        boolean bl = false;
        if (arrayList.get(3) == null) {
            fArray = (float[])b.remove(n2);
            bl = true;
        } else {
            objectArray = arrayList.get(3).split("\\s+");
            float f2 = Float.parseFloat(objectArray[0]);
            float f3 = Float.parseFloat(objectArray[1]);
            float f4 = Float.parseFloat(objectArray[2]);
            float f5 = objectArray.length == 4 ? Float.parseFloat(objectArray[3]) : 1.0f;
            fArray = new float[]{f2 * f5, f3 * f5, f4 * f5, f5};
        }
        objectArray = biI2.j(n2);
        biI2.a(n2, fArray);
        if (!b.contains(n2) && objectArray != null && !bl) {
            b.put(n2, (Object)objectArray);
        }
        biI2.E();
    }

    @Override
    public boolean a() {
        return false;
    }

    public static void a(String[] stringArray) {
        Pattern pattern = Pattern.compile("(setSkinColor)\\s+([\\w\\-]+)\\s*((?:[0-1](?:\\.[0-9]+)?\\s*){3,4})?");
        Matcher matcher = pattern.matcher("setSkinColor Cheveux 1.0");
        if (matcher.matches()) {
            matcher.reset();
            ArrayList arrayList = new ArrayList();
            while (matcher.find()) {
                for (int k = 0; k <= matcher.groupCount(); ++k) {
                    if (k == 3) {
                        String[] stringArray2 = matcher.group(3).split("\\s+");
                        for (int i2 = 0; i2 < stringArray2.length; ++i2) {
                            System.out.println(stringArray2[i2]);
                        }
                        continue;
                    }
                    System.out.println(matcher.group(k));
                }
            }
        }
    }
}

