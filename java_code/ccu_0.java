/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 *  javax.inject.Inject
 *  org.apache.log4j.Logger
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import javax.inject.Inject;
import org.apache.log4j.Logger;

/*
 * Renamed from cCU
 */
final class ccu_0
extends SimpleChannelInboundHandler<String> {
    private final Logger a = Logger.getLogger(ccu_0.class);
    private final emd b;

    @Inject
    ccu_0(emd emd2) {
        super(true);
        this.b = emd2;
    }

    protected void a(ChannelHandlerContext channelHandlerContext, String string) {
        Gson gson = new GsonBuilder().create();
        cDf cDf2 = (cDf)gson.fromJson(string, cDf.class);
        switch (cDf2.b()) {
            case c: {
                cDc cDc2 = (cDc)gson.fromJson(string, cDc.class);
                this.a(cDc2, channelHandlerContext);
                break;
            }
            case b: {
                cDg cDg2 = (cDg)gson.fromJson(string, cDg.class);
                this.a(cDg2, channelHandlerContext);
                break;
            }
            case a: {
                this.a.warn((Object)("Received message with id " + cDf2.a() + " but it was ignored"));
            }
        }
    }

    private void a(cDg cDg2, ChannelHandlerContext channelHandlerContext) {
        this.b.a(cDg2.b());
    }

    private void a(cDc cDc2, ChannelHandlerContext channelHandlerContext) {
        this.a.error((Object)("Error message received from updater: " + cDc2.b() + " (type: " + cDc2.c() + ")"));
        channelHandlerContext.close();
    }

    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) {
        this.a(channelHandlerContext, (String)object);
    }
}

