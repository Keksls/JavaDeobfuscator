/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.model.MediaOneOf$DiscriminatorEnum
 */
import com.ankama.shopi.client.model.MediaOneOf;

/*
 * Renamed from bSh
 */
class bsh_2 {
    static final /* synthetic */ int[] a;

    static {
        a = new int[MediaOneOf.DiscriminatorEnum.values().length];
        try {
            bsh_2.a[MediaOneOf.DiscriminatorEnum.MEDIAIMAGE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bsh_2.a[MediaOneOf.DiscriminatorEnum.MEDIAYOUTUBEVIDEO.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bsh_2.a[MediaOneOf.DiscriminatorEnum.UNKNOWN_DEFAULT_OPEN_API.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

