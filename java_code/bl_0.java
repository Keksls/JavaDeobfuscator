/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.Internal
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from BL
 */
public final class bl_0
extends GeneratedMessageV3
implements BO {
    private static final long h = 0L;
    int i;
    public static final int a = 1;
    long j;
    public static final int b = 2;
    By k;
    public static final int c = 3;
    List<bc_0> l;
    public static final int d = 4;
    long m;
    public static final int e = 5;
    List<AY> n;
    public static final int f = 6;
    volatile Object o;
    private byte p = (byte)-1;
    private static final bl_0 q = new bl_0();
    @Deprecated
    public static final Parser<bl_0> g = new BM();

    bl_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private bl_0() {
        this.j = 0L;
        this.l = Collections.emptyList();
        this.m = 0L;
        this.n = Collections.emptyList();
        this.o = "";
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    bl_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block15: while (!bl) {
                Object object;
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block15;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue block15;
                        bl = true;
                        continue block15;
                    }
                    case 8: {
                        this.i |= 1;
                        this.j = codedInputStream.readInt64();
                        continue block15;
                    }
                    case 18: {
                        object = null;
                        if ((this.i & 2) == 2) {
                            object = this.k.h();
                        }
                        this.k = (By)codedInputStream.readMessage(By.c, extensionRegistryLite);
                        if (object != null) {
                            ((BA)object).a(this.k);
                            this.k = ((BA)object).i();
                        }
                        this.i |= 2;
                        continue block15;
                    }
                    case 26: {
                        if ((n & 4) != 4) {
                            this.l = new ArrayList<bc_0>();
                            n |= 4;
                        }
                        this.l.add((bc_0)codedInputStream.readMessage(bc_0.c, extensionRegistryLite));
                        continue block15;
                    }
                    case 32: {
                        this.i |= 4;
                        this.m = codedInputStream.readInt64();
                        continue block15;
                    }
                    case 42: {
                        if ((n & 0x10) != 16) {
                            this.n = new ArrayList<AY>();
                            n |= 0x10;
                        }
                        this.n.add((AY)codedInputStream.readMessage(AY.f, extensionRegistryLite));
                        continue block15;
                    }
                    case 50: 
                }
                object = codedInputStream.readBytes();
                this.i |= 8;
                this.o = object;
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if ((n & 4) == 4) {
                this.l = Collections.unmodifiableList(this.l);
            }
            if ((n & 0x10) == 16) {
                this.n = Collections.unmodifiableList(this.n);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return AO.q;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AO.r.ensureFieldAccessorsInitialized(bl_0.class, BN.class);
    }

    @Override
    @Deprecated
    public boolean b() {
        return (this.i & 1) == 1;
    }

    @Override
    @Deprecated
    public long c() {
        return this.j;
    }

    @Override
    public boolean d() {
        return (this.i & 2) == 2;
    }

    @Override
    public By e() {
        return this.k == null ? By.i() : this.k;
    }

    @Override
    public BB f() {
        return this.k == null ? By.i() : this.k;
    }

    @Override
    public List<bc_0> g() {
        return this.l;
    }

    @Override
    public List<? extends bf_0> h() {
        return this.l;
    }

    @Override
    public int i() {
        return this.l.size();
    }

    @Override
    public bc_0 a(int n) {
        return this.l.get(n);
    }

    @Override
    public bf_0 b(int n) {
        return this.l.get(n);
    }

    @Override
    public boolean j() {
        return (this.i & 4) == 4;
    }

    @Override
    public long k() {
        return this.m;
    }

    @Override
    public List<AY> l() {
        return this.n;
    }

    @Override
    public List<? extends bb_0> m() {
        return this.n;
    }

    @Override
    public int n() {
        return this.n.size();
    }

    @Override
    public AY c(int n) {
        return this.n.get(n);
    }

    @Override
    public bb_0 d(int n) {
        return this.n.get(n);
    }

    @Override
    public boolean o() {
        return (this.i & 8) == 8;
    }

    @Override
    public String p() {
        Object object = this.o;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.o = string;
        }
        return string;
    }

    @Override
    public ByteString q() {
        Object object = this.o;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.o = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public final boolean isInitialized() {
        int n;
        byte by = this.p;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.d()) {
            this.p = 0;
            return false;
        }
        if (!this.e().isInitialized()) {
            this.p = 0;
            return false;
        }
        for (n = 0; n < this.i(); ++n) {
            if (this.a(n).isInitialized()) continue;
            this.p = 0;
            return false;
        }
        for (n = 0; n < this.n(); ++n) {
            if (this.c(n).isInitialized()) continue;
            this.p = 0;
            return false;
        }
        this.p = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        int n;
        if ((this.i & 1) == 1) {
            codedOutputStream.writeInt64(1, this.j);
        }
        if ((this.i & 2) == 2) {
            codedOutputStream.writeMessage(2, (MessageLite)this.e());
        }
        for (n = 0; n < this.l.size(); ++n) {
            codedOutputStream.writeMessage(3, (MessageLite)this.l.get(n));
        }
        if ((this.i & 4) == 4) {
            codedOutputStream.writeInt64(4, this.m);
        }
        for (n = 0; n < this.n.size(); ++n) {
            codedOutputStream.writeMessage(5, (MessageLite)this.n.get(n));
        }
        if ((this.i & 8) == 8) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)6, (Object)this.o);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n;
        int n2 = this.memoizedSize;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        if ((this.i & 1) == 1) {
            n2 += CodedOutputStream.computeInt64Size((int)1, (long)this.j);
        }
        if ((this.i & 2) == 2) {
            n2 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.e());
        }
        for (n = 0; n < this.l.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)3, (MessageLite)((MessageLite)this.l.get(n)));
        }
        if ((this.i & 4) == 4) {
            n2 += CodedOutputStream.computeInt64Size((int)4, (long)this.m);
        }
        for (n = 0; n < this.n.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)5, (MessageLite)((MessageLite)this.n.get(n)));
        }
        if ((this.i & 8) == 8) {
            n2 += GeneratedMessageV3.computeStringSize((int)6, (Object)this.o);
        }
        this.memoizedSize = n2 += this.unknownFields.getSerializedSize();
        return n2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bl_0)) {
            return super.equals(object);
        }
        bl_0 bl_02 = (bl_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == bl_02.b();
        if (this.b()) {
            bl = bl && this.c() == bl_02.c();
        }
        boolean bl3 = bl = bl && this.d() == bl_02.d();
        if (this.d()) {
            bl = bl && this.e().equals(bl_02.e());
        }
        bl = bl && this.g().equals(bl_02.g());
        boolean bl4 = bl = bl && this.j() == bl_02.j();
        if (this.j()) {
            bl = bl && this.k() == bl_02.k();
        }
        bl = bl && this.l().equals(bl_02.l());
        boolean bl5 = bl = bl && this.o() == bl_02.o();
        if (this.o()) {
            bl = bl && this.p().equals(bl_02.p());
        }
        bl = bl && this.unknownFields.equals((Object)bl_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + bl_0.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.c());
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.e().hashCode();
        }
        if (this.i() > 0) {
            n = 37 * n + 3;
            n = 53 * n + this.g().hashCode();
        }
        if (this.j()) {
            n = 37 * n + 4;
            n = 53 * n + Internal.hashLong((long)this.k());
        }
        if (this.n() > 0) {
            n = 37 * n + 5;
            n = 53 * n + this.l().hashCode();
        }
        if (this.o()) {
            n = 37 * n + 6;
            n = 53 * n + this.p().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static bl_0 a(ByteBuffer byteBuffer) {
        return (bl_0)g.parseFrom(byteBuffer);
    }

    public static bl_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (bl_0)g.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static bl_0 a(ByteString byteString) {
        return (bl_0)g.parseFrom(byteString);
    }

    public static bl_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (bl_0)g.parseFrom(byteString, extensionRegistryLite);
    }

    public static bl_0 a(byte[] byArray) {
        return (bl_0)g.parseFrom(byArray);
    }

    public static bl_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (bl_0)g.parseFrom(byArray, extensionRegistryLite);
    }

    public static bl_0 a(InputStream inputStream) {
        return (bl_0)GeneratedMessageV3.parseWithIOException(g, (InputStream)inputStream);
    }

    public static bl_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bl_0)GeneratedMessageV3.parseWithIOException(g, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bl_0 b(InputStream inputStream) {
        return (bl_0)GeneratedMessageV3.parseDelimitedWithIOException(g, (InputStream)inputStream);
    }

    public static bl_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bl_0)GeneratedMessageV3.parseDelimitedWithIOException(g, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bl_0 a(CodedInputStream codedInputStream) {
        return (bl_0)GeneratedMessageV3.parseWithIOException(g, (CodedInputStream)codedInputStream);
    }

    public static bl_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bl_0)GeneratedMessageV3.parseWithIOException(g, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public BN r() {
        return bl_0.s();
    }

    public static BN s() {
        return q.t();
    }

    public static BN a(bl_0 bl_02) {
        return q.t().a(bl_02);
    }

    public BN t() {
        return this == q ? new BN() : new BN().a(this);
    }

    protected BN a(GeneratedMessageV3.BuilderParent builderParent) {
        BN bN = new BN(builderParent);
        return bN;
    }

    public static bl_0 u() {
        return q;
    }

    public static Parser<bl_0> v() {
        return g;
    }

    public Parser<bl_0> getParserForType() {
        return g;
    }

    public bl_0 w() {
        return q;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.t();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.r();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.t();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.r();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.w();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.w();
    }

    static /* synthetic */ boolean x() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean y() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean z() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(bl_0 bl_02) {
        return bl_02.unknownFields;
    }
}

