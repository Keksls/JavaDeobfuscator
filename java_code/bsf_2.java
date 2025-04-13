/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.model.PromoteSectionOneOf$DiscriminatorEnum
 */
import com.ankama.shopi.client.model.PromoteSectionOneOf;

/*
 * Renamed from bSf
 */
class bsf_2 {
    static final /* synthetic */ int[] a;

    static {
        a = new int[PromoteSectionOneOf.DiscriminatorEnum.values().length];
        try {
            bsf_2.a[PromoteSectionOneOf.DiscriminatorEnum.PROMOTESECTIONARTICLE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bsf_2.a[PromoteSectionOneOf.DiscriminatorEnum.PROMOTESECTIONCAROUSEL.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bsf_2.a[PromoteSectionOneOf.DiscriminatorEnum.UNKNOWN_DEFAULT_OPEN_API.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

