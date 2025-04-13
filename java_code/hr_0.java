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

/*
 * Renamed from hr
 */
public final class hr_0
extends GeneratedMessageV3
implements hu_0 {
    private static final long h = 0L;
    int i;
    public static final int a = 1;
    int j;
    public static final int b = 2;
    boolean k;
    public static final int c = 3;
    volatile Object l;
    public static final int d = 4;
    int m;
    public static final int e = 5;
    long n;
    public static final int f = 6;
    volatile Object o;
    private byte p = (byte)-1;
    private static final hr_0 q = new hr_0();
    @Deprecated
    public static final Parser<hr_0> g = new hs_0();

    hr_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private hr_0() {
        this.j = 0;
        this.k = false;
        this.l = "";
        this.m = 0;
        this.n = 0L;
        this.o = "";
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    hr_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block15: while (!bl2) {
                ByteString byteString;
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block15;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block15;
                        bl2 = true;
                        continue block15;
                    }
                    case 8: {
                        this.i |= 1;
                        this.j = codedInputStream.readInt32();
                        continue block15;
                    }
                    case 16: {
                        this.i |= 2;
                        this.k = codedInputStream.readBool();
                        continue block15;
                    }
                    case 26: {
                        byteString = codedInputStream.readBytes();
                        this.i |= 4;
                        this.l = byteString;
                        continue block15;
                    }
                    case 32: {
                        this.i |= 8;
                        this.m = codedInputStream.readInt32();
                        continue block15;
                    }
                    case 40: {
                        this.i |= 0x10;
                        this.n = codedInputStream.readInt64();
                        continue block15;
                    }
                    case 50: 
                }
                byteString = codedInputStream.readBytes();
                this.i |= 0x20;
                this.o = byteString;
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return hl_0.g;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hl_0.h.ensureFieldAccessorsInitialized(hr_0.class, ht_0.class);
    }

    @Override
    public boolean b() {
        return (this.i & 1) == 1;
    }

    @Override
    public int c() {
        return this.j;
    }

    @Override
    public boolean d() {
        return (this.i & 2) == 2;
    }

    @Override
    public boolean e() {
        return this.k;
    }

    @Override
    public boolean f() {
        return (this.i & 4) == 4;
    }

    @Override
    public String g() {
        Object object = this.l;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.l = string;
        }
        return string;
    }

    @Override
    public ByteString h() {
        Object object = this.l;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.l = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean i() {
        return (this.i & 8) == 8;
    }

    @Override
    public int j() {
        return this.m;
    }

    @Override
    public boolean k() {
        return (this.i & 0x10) == 16;
    }

    @Override
    public long l() {
        return this.n;
    }

    @Override
    public boolean m() {
        return (this.i & 0x20) == 32;
    }

    @Override
    public String n() {
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
    public ByteString o() {
        Object object = this.o;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.o = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public final boolean isInitialized() {
        byte by = this.p;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.p = 0;
            return false;
        }
        this.p = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.i & 1) == 1) {
            codedOutputStream.writeInt32(1, this.j);
        }
        if ((this.i & 2) == 2) {
            codedOutputStream.writeBool(2, this.k);
        }
        if ((this.i & 4) == 4) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)3, (Object)this.l);
        }
        if ((this.i & 8) == 8) {
            codedOutputStream.writeInt32(4, this.m);
        }
        if ((this.i & 0x10) == 16) {
            codedOutputStream.writeInt64(5, this.n);
        }
        if ((this.i & 0x20) == 32) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)6, (Object)this.o);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.i & 1) == 1) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.j);
        }
        if ((this.i & 2) == 2) {
            n += CodedOutputStream.computeBoolSize((int)2, (boolean)this.k);
        }
        if ((this.i & 4) == 4) {
            n += GeneratedMessageV3.computeStringSize((int)3, (Object)this.l);
        }
        if ((this.i & 8) == 8) {
            n += CodedOutputStream.computeInt32Size((int)4, (int)this.m);
        }
        if ((this.i & 0x10) == 16) {
            n += CodedOutputStream.computeInt64Size((int)5, (long)this.n);
        }
        if ((this.i & 0x20) == 32) {
            n += GeneratedMessageV3.computeStringSize((int)6, (Object)this.o);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof hr_0)) {
            return super.equals(object);
        }
        hr_0 hr_02 = (hr_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == hr_02.b();
        if (this.b()) {
            bl = bl && this.c() == hr_02.c();
        }
        boolean bl3 = bl = bl && this.d() == hr_02.d();
        if (this.d()) {
            bl = bl && this.e() == hr_02.e();
        }
        boolean bl4 = bl = bl && this.f() == hr_02.f();
        if (this.f()) {
            bl = bl && this.g().equals(hr_02.g());
        }
        boolean bl5 = bl = bl && this.i() == hr_02.i();
        if (this.i()) {
            bl = bl && this.j() == hr_02.j();
        }
        boolean bl6 = bl = bl && this.k() == hr_02.k();
        if (this.k()) {
            bl = bl && this.l() == hr_02.l();
        }
        boolean bl7 = bl = bl && this.m() == hr_02.m();
        if (this.m()) {
            bl = bl && this.n().equals(hr_02.n());
        }
        bl = bl && this.unknownFields.equals((Object)hr_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + hr_0.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c();
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashBoolean((boolean)this.e());
        }
        if (this.f()) {
            n = 37 * n + 3;
            n = 53 * n + this.g().hashCode();
        }
        if (this.i()) {
            n = 37 * n + 4;
            n = 53 * n + this.j();
        }
        if (this.k()) {
            n = 37 * n + 5;
            n = 53 * n + Internal.hashLong((long)this.l());
        }
        if (this.m()) {
            n = 37 * n + 6;
            n = 53 * n + this.n().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static hr_0 a(ByteBuffer byteBuffer) {
        return (hr_0)g.parseFrom(byteBuffer);
    }

    public static hr_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (hr_0)g.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static hr_0 a(ByteString byteString) {
        return (hr_0)g.parseFrom(byteString);
    }

    public static hr_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (hr_0)g.parseFrom(byteString, extensionRegistryLite);
    }

    public static hr_0 a(byte[] byArray) {
        return (hr_0)g.parseFrom(byArray);
    }

    public static hr_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (hr_0)g.parseFrom(byArray, extensionRegistryLite);
    }

    public static hr_0 a(InputStream inputStream) {
        return (hr_0)GeneratedMessageV3.parseWithIOException(g, (InputStream)inputStream);
    }

    public static hr_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hr_0)GeneratedMessageV3.parseWithIOException(g, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static hr_0 b(InputStream inputStream) {
        return (hr_0)GeneratedMessageV3.parseDelimitedWithIOException(g, (InputStream)inputStream);
    }

    public static hr_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hr_0)GeneratedMessageV3.parseDelimitedWithIOException(g, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static hr_0 a(CodedInputStream codedInputStream) {
        return (hr_0)GeneratedMessageV3.parseWithIOException(g, (CodedInputStream)codedInputStream);
    }

    public static hr_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hr_0)GeneratedMessageV3.parseWithIOException(g, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ht_0 p() {
        return hr_0.q();
    }

    public static ht_0 q() {
        return q.r();
    }

    public static ht_0 a(hr_0 hr_02) {
        return q.r().a(hr_02);
    }

    public ht_0 r() {
        return this == q ? new ht_0() : new ht_0().a(this);
    }

    protected ht_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        ht_0 ht_02 = new ht_0(builderParent);
        return ht_02;
    }

    public static hr_0 s() {
        return q;
    }

    public static Parser<hr_0> t() {
        return g;
    }

    public Parser<hr_0> getParserForType() {
        return g;
    }

    public hr_0 u() {
        return q;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.r();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.p();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.r();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.p();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.u();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.u();
    }

    static /* synthetic */ boolean v() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(hr_0 hr_02) {
        return hr_02.unknownFields;
    }
}

