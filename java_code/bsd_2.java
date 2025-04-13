/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.model.PromoteGroup
 *  com.ankama.shopi.client.model.PromoteSectionArticle
 *  com.ankama.shopi.client.model.PromoteSectionCarousel
 *  com.ankama.shopi.client.model.PromoteSectionOneOf
 *  com.ankama.shopi.client.model.PromoteSectionOneOf$DiscriminatorEnum
 */
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.model.PromoteGroup;
import com.ankama.shopi.client.model.PromoteSectionArticle;
import com.ankama.shopi.client.model.PromoteSectionCarousel;
import com.ankama.shopi.client.model.PromoteSectionOneOf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/*
 * Renamed from bSd
 */
class bsd_2
implements ApiCallback<PromoteGroup> {
    final /* synthetic */ bsb_2 a;

    bsd_2(bsb_2 bsb_22) {
        this.a = bsb_22;
    }

    public void onFailure(ApiException apiException, int n, Map<String, List<String>> map) {
        bsc_2.a.error((Object)"Following error occured during getHomePhagePromoteGroup request", (Throwable)apiException);
        this.a.a();
    }

    public void a(PromoteGroup promoteGroup, int n, Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        block4: for (PromoteSectionOneOf promoteSectionOneOf : promoteGroup.getPromoteSections()) {
            PromoteSectionOneOf.DiscriminatorEnum discriminatorEnum = promoteSectionOneOf.getDiscriminator();
            switch (discriminatorEnum) {
                case PROMOTESECTIONARTICLE: {
                    PromoteSectionArticle promoteSectionArticle = promoteSectionOneOf.getPromoteSectionArticle();
                    if (promoteSectionArticle == null) {
                        bsc_2.a.warn((Object)String.format("Missing %s with following discriminator %s in following %s", PromoteSectionArticle.class, discriminatorEnum, promoteSectionOneOf));
                        continue block4;
                    }
                    arrayList.addAll(cbj_1.a(promoteSectionArticle.getTargets()));
                    continue block4;
                }
                case PROMOTESECTIONCAROUSEL: {
                    PromoteSectionArticle promoteSectionArticle = promoteSectionOneOf.getPromoteSectionCarousel();
                    if (promoteSectionArticle == null) {
                        bsc_2.a.warn((Object)String.format("Missing %s with following discriminator %s in following %s", PromoteSectionCarousel.class, discriminatorEnum, promoteSectionOneOf));
                        continue block4;
                    }
                    arrayList2.addAll(bsp_2.b(promoteSectionArticle.getPromotes()));
                    continue block4;
                }
            }
            bsc_2.a.warn((Object)String.format("Unknown/Unsupported discriminator %s to extract promoted stuff from %s", discriminatorEnum, promoteSectionOneOf));
        }
        this.a.a(arrayList2, Collections.emptyList(), arrayList);
    }

    public void onUploadProgress(long l, long l2, boolean bl) {
    }

    public void onDownloadProgress(long l, long l2, boolean bl) {
    }

    public /* synthetic */ void onSuccess(Object object, int n, Map map) {
        this.a((PromoteGroup)object, n, map);
    }
}

