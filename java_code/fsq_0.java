/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Arrays;
import java.util.Collections;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fsq
 */
public abstract class fsq_0<Content>
extends fso {
    public static final int CONTENT_HASH = "content".hashCode();

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == CONTENT_HASH) {
            return this.setContentProperty(object);
        }
        return super.setPropertyAttribute(n, object);
    }

    public boolean setContentProperty(@Nullable Object object) {
        return fyo.setIterableProperty(object, this::setContent, this::setContent);
    }

    public void setContent(@Nullable Content[] ContentArray) {
        this.setContent(ContentArray != null ? Arrays.asList(ContentArray) : Collections.emptyList());
    }

    public void setContent(@NotNull Iterable<Content> iterable) {
        this.setContent(iterable, false);
    }

    public abstract void setContent(@NotNull Iterable<Content> var1, boolean var2);

    public abstract Iterable<Content> getUnfilteredContent();
}

