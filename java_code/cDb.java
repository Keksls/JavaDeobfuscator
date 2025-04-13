/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.collect.ImmutableList
 *  com.google.inject.Module
 *  com.google.inject.PrivateModule
 *  com.google.inject.Provides
 *  com.google.inject.Scopes
 *  io.netty.channel.ChannelHandler
 *  io.netty.handler.codec.string.StringDecoder
 *  io.netty.handler.codec.string.StringEncoder
 */
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.inject.Module;
import com.google.inject.PrivateModule;
import com.google.inject.Provides;
import com.google.inject.Scopes;
import io.netty.channel.ChannelHandler;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import java.util.List;

public final class cDb
extends PrivateModule {
    @GL
    public List<Module> a() {
        return ImmutableList.of((Object)((Object)new azt_0()), (Object)((Object)new emg()));
    }

    protected void configure() {
        this.bind(ccw_0.class).in(Scopes.SINGLETON);
        this.expose(ccw_0.class);
    }

    @Provides
    private List<ChannelHandler> a(cct_0 cct_02, ccu_0 ccu_02, ccs_0 ccs_02) {
        return ImmutableList.of((Object)new StringDecoder(Charsets.UTF_8), (Object)new StringEncoder(Charsets.UTF_8), (Object)((Object)cct_02), (Object)((Object)ccu_02), (Object)((Object)ccs_02));
    }
}

