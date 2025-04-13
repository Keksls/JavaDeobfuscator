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
 * Renamed from bs
 */
public final class bs_1
extends GeneratedMessageV3
implements bv_1 {
    private static final long b = 0L;
    public static final int a = 1;
    List<bo_1> c;
    private byte d = (byte)-1;
    private static final bs_1 e = new bs_1();
    static final Parser<bs_1> f = new bt_2();

    bs_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private bs_1() {
        this.c = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    bs_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block10: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block10;
                    }
                    default: {
                        if (this.parseUnknownFieldProto3(codedInputStream, builder, extensionRegistryLite, n)) continue block10;
                        bl2 = true;
                        continue block10;
                    }
                    case 10: 
                }
                if (!(bl & true)) {
                    this.c = new ArrayList<bo_1>();
                    bl |= true;
                }
                this.c.add((bo_1)codedInputStream.readMessage(bo_1.h(), extensionRegistryLite));
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if (bl & true) {
                this.c = Collections.unmodifiableList(this.c);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return ak_2.ag;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.ah.ensureFieldAccessorsInitialized(bs_1.class, bu_2.class);
    }

    @Override
    public List<bo_1> b() {
        return this.c;
    }

    @Override
    public List<? extends br_1> c() {
        return this.c;
    }

    @Override
    public int d() {
        return this.c.size();
    }

    @Override
    public bo_1 a(int n) {
        return this.c.get(n);
    }

    @Override
    public br_1 b(int n) {
        return this.c.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.d;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.d = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int k = 0; k < this.c.size(); ++k) {
            codedOutputStream.writeMessage(1, (MessageLite)this.c.get(k));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int k = 0; k < this.c.size(); ++k) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.c.get(k)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bs_1)) {
            return super.equals(object);
        }
        bs_1 bs_12 = (bs_1)object;
        boolean bl = true;
        bl = bl && this.b().equals(bs_12.b());
        bl = bl && this.unknownFields.equals((Object)bs_12.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + bs_1.a().hashCode();
        if (this.d() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.b().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static bs_1 a(ByteBuffer byteBuffer) {
        return (bs_1)f.parseFrom(byteBuffer);
    }

    public static bs_1 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (bs_1)f.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static bs_1 a(ByteString byteString) {
        return (bs_1)f.parseFrom(byteString);
    }

    public static bs_1 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (bs_1)f.parseFrom(byteString, extensionRegistryLite);
    }

    public static bs_1 a(byte[] byArray) {
        return (bs_1)f.parseFrom(byArray);
    }

    public static bs_1 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (bs_1)f.parseFrom(byArray, extensionRegistryLite);
    }

    public static bs_1 a(InputStream inputStream) {
        return (bs_1)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream);
    }

    public static bs_1 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bs_1)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bs_1 b(InputStream inputStream) {
        return (bs_1)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream);
    }

    public static bs_1 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bs_1)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bs_1 a(CodedInputStream codedInputStream) {
        return (bs_1)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream);
    }

    public static bs_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bs_1)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public bu_2 e() {
        return bs_1.f();
    }

    public static bu_2 f() {
        return e.g();
    }

    public static bu_2 a(bs_1 bs_12) {
        return e.g().a(bs_12);
    }

    public bu_2 g() {
        return this == e ? new bu_2() : new bu_2().a(this);
    }

    protected bu_2 a(GeneratedMessageV3.BuilderParent builderParent) {
        bu_2 bu_22 = new bu_2(builderParent);
        return bu_22;
    }

    public static bs_1 h() {
        return e;
    }

    public static Parser<bs_1> i() {
        return f;
    }

    public Parser<bs_1> getParserForType() {
        return f;
    }

    public bs_1 j() {
        return e;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.g();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.e();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.e();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.j();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.j();
    }

    static /* synthetic */ boolean k() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean l() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(bs_1 bs_12) {
        return bs_12.unknownFields;
    }
}

