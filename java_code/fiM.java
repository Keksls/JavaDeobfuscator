/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.base.Joiner;
import java.util.regex.Pattern;
import org.jetbrains.annotations.Nullable;

public final class fiM {
    private fiM() {
    }

    public static String a(fiO fiO2) {
        if (fiO2 == null) {
            return "";
        }
        Joiner joiner = Joiner.on((String)"-");
        return joiner.join(fiO2.e());
    }

    @Nullable
    public static fiO a(String string) {
        if (!Pattern.matches("\\d*((-\\d*)*)?", string)) {
            return null;
        }
        String[] stringArray = string.split("-");
        if (stringArray.length != fiK.c + fiK.d) {
            return null;
        }
        int[] nArray = new int[fiK.c];
        for (int k = 0; k < fiK.c; ++k) {
            nArray[k] = Integer.parseInt(stringArray[k]);
        }
        int[] nArray2 = new int[fiK.d];
        for (int k = 0; k < fiK.d; ++k) {
            nArray2[k] = Integer.parseInt(stringArray[k + fiK.c]);
        }
        return new fiO(nArray, nArray2);
    }
}

