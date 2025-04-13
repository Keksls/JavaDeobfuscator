/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.model.ArticlePaymentModeOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.MetadataOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.PromoteTargetOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.ReferenceOneOf$DiscriminatorEnum
 */
import com.ankama.shopi.client.model.ArticlePaymentModeOneOf;
import com.ankama.shopi.client.model.MetadataOneOf;
import com.ankama.shopi.client.model.PromoteTargetOneOf;
import com.ankama.shopi.client.model.ReferenceOneOf;

/*
 * Renamed from bSq
 */
class bsq_2 {
    static final /* synthetic */ int[] a;
    static final /* synthetic */ int[] b;
    static final /* synthetic */ int[] c;
    static final /* synthetic */ int[] d;
    static final /* synthetic */ int[] e;

    static {
        e = new int[ReferenceOneOf.DiscriminatorEnum.values().length];
        try {
            bsq_2.e[ReferenceOneOf.DiscriminatorEnum.KARDREFERENCE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bsq_2.e[ReferenceOneOf.DiscriminatorEnum.GAMEACTIONREFERENCE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bsq_2.e[ReferenceOneOf.DiscriminatorEnum.CLASSICREFERENCE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bsq_2.e[ReferenceOneOf.DiscriminatorEnum.SERVERREFERENCE.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bsq_2.e[ReferenceOneOf.DiscriminatorEnum.WAVENITEMREFERENCE.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bsq_2.e[ReferenceOneOf.DiscriminatorEnum.ACCOUNTSTATUSREFERENCE.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bsq_2.e[ReferenceOneOf.DiscriminatorEnum.VIRTUALSUBSCRIPTIONREFERENCE.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bsq_2.e[ReferenceOneOf.DiscriminatorEnum.VODREFERENCE.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bsq_2.e[ReferenceOneOf.DiscriminatorEnum.WEBTOONREFERENCE.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bsq_2.e[ReferenceOneOf.DiscriminatorEnum.OGRINEREFERENCE.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bsq_2.e[ReferenceOneOf.DiscriminatorEnum.OGRINETOKENREFERENCE.ordinal()] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bsq_2.e[ReferenceOneOf.DiscriminatorEnum.GOULTINEREFERENCE.ordinal()] = 12;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bsq_2.e[ReferenceOneOf.DiscriminatorEnum.UNKNOWN_DEFAULT_OPEN_API.ordinal()] = 13;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        d = new int[MetadataOneOf.DiscriminatorEnum.values().length];
        try {
            bsq_2.d[MetadataOneOf.DiscriminatorEnum.STRINGMETADATA.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bsq_2.d[MetadataOneOf.DiscriminatorEnum.UNKNOWN_DEFAULT_OPEN_API.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        c = new int[ArticlePaymentModeOneOf.DiscriminatorEnum.values().length];
        try {
            bsq_2.c[ArticlePaymentModeOneOf.DiscriminatorEnum.ARTICLEFREEPAYMENTMODE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bsq_2.c[ArticlePaymentModeOneOf.DiscriminatorEnum.ARTICLENONVIRTUALPAYMENTMODE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bsq_2.c[ArticlePaymentModeOneOf.DiscriminatorEnum.ARTICLEVIRTUALPAYMENTMODE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bsq_2.c[ArticlePaymentModeOneOf.DiscriminatorEnum.ARTICLEMOBILEPAYMENTMODE.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bsq_2.c[ArticlePaymentModeOneOf.DiscriminatorEnum.UNKNOWN_DEFAULT_OPEN_API.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        b = new int[PromoteTargetOneOf.DiscriminatorEnum.values().length];
        try {
            bsq_2.b[PromoteTargetOneOf.DiscriminatorEnum.ARTICLE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bsq_2.b[PromoteTargetOneOf.DiscriminatorEnum.CATEGORY.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bsq_2.b[PromoteTargetOneOf.DiscriminatorEnum.LINK.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bsq_2.b[PromoteTargetOneOf.DiscriminatorEnum.UNKNOWN_DEFAULT_OPEN_API.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        a = new int[bsx_0.values().length];
        try {
            bsq_2.a[bsx_0.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bsq_2.a[bsx_0.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bsq_2.a[bsx_0.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bsq_2.a[bsx_0.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bsq_2.a[bsx_0.e.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bsq_2.a[bsx_0.g.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bsq_2.a[bsx_0.h.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bsq_2.a[bsx_0.f.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bsq_2.a[bsx_0.i.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

