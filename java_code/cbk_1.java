/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.model.CartPaymentModeOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.ReferenceOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.VirtualPaymentModeId
 */
import com.ankama.shopi.client.model.CartPaymentModeOneOf;
import com.ankama.shopi.client.model.ReferenceOneOf;
import com.ankama.shopi.client.model.VirtualPaymentModeId;

/*
 * Renamed from cbk
 */
class cbk_1 {
    static final /* synthetic */ int[] a;
    static final /* synthetic */ int[] b;
    static final /* synthetic */ int[] c;

    static {
        c = new int[CartPaymentModeOneOf.DiscriminatorEnum.values().length];
        try {
            cbk_1.c[CartPaymentModeOneOf.DiscriminatorEnum.CARTFREEPAYMENTMODE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cbk_1.c[CartPaymentModeOneOf.DiscriminatorEnum.CARTVIRTUALPAYMENTMODE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cbk_1.c[CartPaymentModeOneOf.DiscriminatorEnum.CARTNONVIRTUALPAYMENTMODE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cbk_1.c[CartPaymentModeOneOf.DiscriminatorEnum.CARTMOBILEPAYMENTMODE.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cbk_1.c[CartPaymentModeOneOf.DiscriminatorEnum.UNKNOWN_DEFAULT_OPEN_API.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        b = new int[VirtualPaymentModeId.values().length];
        try {
            cbk_1.b[VirtualPaymentModeId.SW.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cbk_1.b[VirtualPaymentModeId.OG.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cbk_1.b[VirtualPaymentModeId.GO.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cbk_1.b[VirtualPaymentModeId.WV.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cbk_1.b[VirtualPaymentModeId.UNKNOWN_DEFAULT_OPEN_API.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        a = new int[ReferenceOneOf.DiscriminatorEnum.values().length];
        try {
            cbk_1.a[ReferenceOneOf.DiscriminatorEnum.KARDREFERENCE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cbk_1.a[ReferenceOneOf.DiscriminatorEnum.GAMEACTIONREFERENCE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cbk_1.a[ReferenceOneOf.DiscriminatorEnum.CLASSICREFERENCE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cbk_1.a[ReferenceOneOf.DiscriminatorEnum.SERVERREFERENCE.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cbk_1.a[ReferenceOneOf.DiscriminatorEnum.WAVENITEMREFERENCE.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cbk_1.a[ReferenceOneOf.DiscriminatorEnum.ACCOUNTSTATUSREFERENCE.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cbk_1.a[ReferenceOneOf.DiscriminatorEnum.VIRTUALSUBSCRIPTIONREFERENCE.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cbk_1.a[ReferenceOneOf.DiscriminatorEnum.VODREFERENCE.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cbk_1.a[ReferenceOneOf.DiscriminatorEnum.WEBTOONREFERENCE.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cbk_1.a[ReferenceOneOf.DiscriminatorEnum.OGRINEREFERENCE.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cbk_1.a[ReferenceOneOf.DiscriminatorEnum.OGRINETOKENREFERENCE.ordinal()] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cbk_1.a[ReferenceOneOf.DiscriminatorEnum.GOULTINEREFERENCE.ordinal()] = 12;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cbk_1.a[ReferenceOneOf.DiscriminatorEnum.UNKNOWN_DEFAULT_OPEN_API.ordinal()] = 13;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

