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
 * Renamed from Bg
 */
public final class bg_0
extends GeneratedMessageV3
implements Bj {
    private static final long d = 0L;
    int e;
    public static final int a = 1;
    long f;
    public static final int b = 2;
    BG g;
    private byte h = (byte)-1;
    private static final bg_0 i = new bg_0();
    @Deprecated
    public static final Parser<bg_0> c = new bh_0();

    bg_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private bg_0() {
        this.f = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    bg_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block11;
                        bl2 = true;
                        continue block11;
                    }
                    case 8: {
                        this.e |= 1;
                        this.f = codedInputStream.readInt64();
                        continue block11;
                    }
                    case 18: 
                }
                bi_0 bi_02 = null;
                if ((this.e & 2) == 2) {
                    bi_02 = this.g.g();
                }
                this.g = (BG)codedInputStream.readMessage(BG.b, extensionRegistryLite);
                if (bi_02 != null) {
                    bi_02.a(this.g);
                    this.g = bi_02.h();
                }
                this.e |= 2;
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
        return AO.g;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AO.h.ensureFieldAccessorsInitialized(bg_0.class, Bi.class);
    }

    @Override
    public boolean b() {
        return (this.e & 1) == 1;
    }

    @Override
    public long c() {
        return this.f;
    }

    @Override
    public boolean d() {
        return (this.e & 2) == 2;
    }

    @Override
    public BG e() {
        return this.g == null ? BG.h() : this.g;
    }

    @Override
    public bp_0 f() {
        return this.g == null ? BG.h() : this.g;
    }

    public final boolean isInitialized() {
        byte by = this.h;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.h = 0;
            return false;
        }
        if (!this.d()) {
            this.h = 0;
            return false;
        }
        if (!this.e().isInitialized()) {
            this.h = 0;
            return false;
        }
        this.h = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.e & 1) == 1) {
            codedOutputStream.writeInt64(1, this.f);
        }
        if ((this.e & 2) == 2) {
            codedOutputStream.writeMessage(2, (MessageLite)this.e());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.e & 1) == 1) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.f);
        }
        if ((this.e & 2) == 2) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.e());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bg_0)) {
            return super.equals(object);
        }
        bg_0 bg_02 = (bg_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == bg_02.b();
        if (this.b()) {
            bl = bl && this.c() == bg_02.c();
        }
        boolean bl3 = bl = bl && this.d() == bg_02.d();
        if (this.d()) {
            bl = bl && this.e().equals(bg_02.e());
        }
        bl = bl && this.unknownFields.equals((Object)bg_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + bg_0.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.c());
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.e().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static bg_0 a(ByteBuffer byteBuffer) {
        return (bg_0)c.parseFrom(byteBuffer);
    }

    public static bg_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (bg_0)c.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static bg_0 a(ByteString byteString) {
        return (bg_0)c.parseFrom(byteString);
    }

    public static bg_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (bg_0)c.parseFrom(byteString, extensionRegistryLite);
    }

    public static bg_0 a(byte[] byArray) {
        return (bg_0)c.parseFrom(byArray);
    }

    public static bg_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (bg_0)c.parseFrom(byArray, extensionRegistryLite);
    }

    public static bg_0 a(InputStream inputStream) {
        return (bg_0)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream);
    }

    public static bg_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bg_0)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bg_0 b(InputStream inputStream) {
        return (bg_0)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream);
    }

    public static bg_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bg_0)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bg_0 a(CodedInputStream codedInputStream) {
        return (bg_0)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream);
    }

    public static bg_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bg_0)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public Bi g() {
        return bg_0.h();
    }

    public static Bi h() {
        return i.i();
    }

    public static Bi a(bg_0 bg_02) {
        return i.i().a(bg_02);
    }

    public Bi i() {
        return this == i ? new Bi() : new Bi().a(this);
    }

    protected Bi a(GeneratedMessageV3.BuilderParent builderParent) {
        Bi bi = new Bi(builderParent);
        return bi;
    }

    public static bg_0 j() {
        return i;
    }

    public static Parser<bg_0> k() {
        return c;
    }

    public Parser<bg_0> getParserForType() {
        return c;
    }

    public bg_0 l() {
        return i;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.i();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.i();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.g();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.l();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.l();
    }

    static /* synthetic */ boolean m() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(bg_0 bg_02) {
        return bg_02.unknownFields;
    }
}

