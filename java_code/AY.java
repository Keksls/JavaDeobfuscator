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

public final class AY
extends GeneratedMessageV3
implements bb_0 {
    private static final long g = 0L;
    int h;
    public static final int a = 1;
    long i;
    public static final int b = 2;
    int j;
    public static final int c = 4;
    long k;
    public static final int d = 5;
    le_0 l;
    public static final int e = 6;
    volatile Object m;
    private byte n = (byte)-1;
    private static final AY o = new AY();
    @Deprecated
    public static final Parser<AY> f = new AZ();

    AY(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private AY() {
        this.i = 0L;
        this.j = 1;
        this.k = 0L;
        this.m = "";
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    AY(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block14: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block14;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block14;
                        bl2 = true;
                        continue block14;
                    }
                    case 8: {
                        this.h |= 1;
                        this.i = codedInputStream.readInt64();
                        continue block14;
                    }
                    case 16: {
                        int n2 = codedInputStream.readEnum();
                        bq_0 bq_02 = bq_0.a(n2);
                        if (bq_02 == null) {
                            builder.mergeVarintField(2, n2);
                            continue block14;
                        }
                        this.h |= 2;
                        this.j = n2;
                        continue block14;
                    }
                    case 32: {
                        this.h |= 4;
                        this.k = codedInputStream.readInt64();
                        continue block14;
                    }
                    case 42: {
                        lg lg2 = null;
                        if ((this.h & 8) == 8) {
                            lg2 = this.l.G();
                        }
                        this.l = (le_0)codedInputStream.readMessage(le_0.l, extensionRegistryLite);
                        if (lg2 != null) {
                            lg2.a(this.l);
                            this.l = lg2.H();
                        }
                        this.h |= 8;
                        continue block14;
                    }
                    case 50: 
                }
                ByteString byteString = codedInputStream.readBytes();
                this.h |= 0x10;
                this.m = byteString;
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
        return AO.u;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AO.v.ensureFieldAccessorsInitialized(AY.class, ba_0.class);
    }

    @Override
    @Deprecated
    public boolean b() {
        return (this.h & 1) == 1;
    }

    @Override
    @Deprecated
    public long c() {
        return this.i;
    }

    @Override
    public boolean d() {
        return (this.h & 2) == 2;
    }

    @Override
    public bq_0 e() {
        bq_0 bq_02 = bq_0.a(this.j);
        return bq_02 == null ? bq_0.a : bq_02;
    }

    @Override
    public boolean f() {
        return (this.h & 4) == 4;
    }

    @Override
    public long g() {
        return this.k;
    }

    @Override
    public boolean h() {
        return (this.h & 8) == 8;
    }

    @Override
    public le_0 i() {
        return this.l == null ? le_0.H() : this.l;
    }

    @Override
    public lp j() {
        return this.l == null ? le_0.H() : this.l;
    }

    @Override
    public boolean k() {
        return (this.h & 0x10) == 16;
    }

    @Override
    public String l() {
        Object object = this.m;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.m = string;
        }
        return string;
    }

    @Override
    public ByteString m() {
        Object object = this.m;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.m = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public final boolean isInitialized() {
        byte by = this.n;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.d()) {
            this.n = 0;
            return false;
        }
        if (!this.f()) {
            this.n = 0;
            return false;
        }
        if (this.h() && !this.i().isInitialized()) {
            this.n = 0;
            return false;
        }
        this.n = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.h & 1) == 1) {
            codedOutputStream.writeInt64(1, this.i);
        }
        if ((this.h & 2) == 2) {
            codedOutputStream.writeEnum(2, this.j);
        }
        if ((this.h & 4) == 4) {
            codedOutputStream.writeInt64(4, this.k);
        }
        if ((this.h & 8) == 8) {
            codedOutputStream.writeMessage(5, (MessageLite)this.i());
        }
        if ((this.h & 0x10) == 16) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)6, (Object)this.m);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.h & 1) == 1) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.i);
        }
        if ((this.h & 2) == 2) {
            n += CodedOutputStream.computeEnumSize((int)2, (int)this.j);
        }
        if ((this.h & 4) == 4) {
            n += CodedOutputStream.computeInt64Size((int)4, (long)this.k);
        }
        if ((this.h & 8) == 8) {
            n += CodedOutputStream.computeMessageSize((int)5, (MessageLite)this.i());
        }
        if ((this.h & 0x10) == 16) {
            n += GeneratedMessageV3.computeStringSize((int)6, (Object)this.m);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof AY)) {
            return super.equals(object);
        }
        AY aY = (AY)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == aY.b();
        if (this.b()) {
            bl = bl && this.c() == aY.c();
        }
        boolean bl3 = bl = bl && this.d() == aY.d();
        if (this.d()) {
            bl = bl && this.j == aY.j;
        }
        boolean bl4 = bl = bl && this.f() == aY.f();
        if (this.f()) {
            bl = bl && this.g() == aY.g();
        }
        boolean bl5 = bl = bl && this.h() == aY.h();
        if (this.h()) {
            bl = bl && this.i().equals(aY.i());
        }
        boolean bl6 = bl = bl && this.k() == aY.k();
        if (this.k()) {
            bl = bl && this.l().equals(aY.l());
        }
        bl = bl && this.unknownFields.equals((Object)aY.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + AY.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.c());
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.j;
        }
        if (this.f()) {
            n = 37 * n + 4;
            n = 53 * n + Internal.hashLong((long)this.g());
        }
        if (this.h()) {
            n = 37 * n + 5;
            n = 53 * n + this.i().hashCode();
        }
        if (this.k()) {
            n = 37 * n + 6;
            n = 53 * n + this.l().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static AY a(ByteBuffer byteBuffer) {
        return (AY)f.parseFrom(byteBuffer);
    }

    public static AY a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (AY)f.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static AY a(ByteString byteString) {
        return (AY)f.parseFrom(byteString);
    }

    public static AY a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (AY)f.parseFrom(byteString, extensionRegistryLite);
    }

    public static AY a(byte[] byArray) {
        return (AY)f.parseFrom(byArray);
    }

    public static AY a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (AY)f.parseFrom(byArray, extensionRegistryLite);
    }

    public static AY a(InputStream inputStream) {
        return (AY)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream);
    }

    public static AY a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AY)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AY b(InputStream inputStream) {
        return (AY)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream);
    }

    public static AY b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AY)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AY a(CodedInputStream codedInputStream) {
        return (AY)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream);
    }

    public static AY a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AY)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ba_0 n() {
        return AY.o();
    }

    public static ba_0 o() {
        return o.p();
    }

    public static ba_0 a(AY aY) {
        return o.p().a(aY);
    }

    public ba_0 p() {
        return this == o ? new ba_0() : new ba_0().a(this);
    }

    protected ba_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        ba_0 ba_02 = new ba_0(builderParent);
        return ba_02;
    }

    public static AY q() {
        return o;
    }

    public static Parser<AY> r() {
        return f;
    }

    public Parser<AY> getParserForType() {
        return f;
    }

    public AY s() {
        return o;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.p();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.n();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.p();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.n();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.s();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.s();
    }

    static /* synthetic */ boolean t() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(AY aY) {
        return aY.unknownFields;
    }
}

