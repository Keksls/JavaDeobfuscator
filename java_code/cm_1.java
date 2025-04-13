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
 * Renamed from cM
 */
public final class cm_1
extends GeneratedMessageV3
implements cp_2 {
    private static final long b = 0L;
    public static final int a = 1;
    List<cd_2> c;
    private byte d = (byte)-1;
    private static final cm_1 e = new cm_1();
    static final Parser<cm_1> f = new cn_1();

    cm_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private cm_1() {
        this.c = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    cm_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    this.c = new ArrayList<cd_2>();
                    bl |= true;
                }
                this.c.add((cd_2)codedInputStream.readMessage(cd_2.k(), extensionRegistryLite));
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
        return ak_2.ac;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.ad.ensureFieldAccessorsInitialized(cm_1.class, co_2.class);
    }

    @Override
    public List<cd_2> b() {
        return this.c;
    }

    @Override
    public List<? extends cq_1> c() {
        return this.c;
    }

    @Override
    public int d() {
        return this.c.size();
    }

    @Override
    public cd_2 a(int n) {
        return this.c.get(n);
    }

    @Override
    public cq_1 b(int n) {
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
        if (!(object instanceof cm_1)) {
            return super.equals(object);
        }
        cm_1 cm_12 = (cm_1)object;
        boolean bl = true;
        bl = bl && this.b().equals(cm_12.b());
        bl = bl && this.unknownFields.equals((Object)cm_12.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + cm_1.a().hashCode();
        if (this.d() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.b().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static cm_1 a(ByteBuffer byteBuffer) {
        return (cm_1)f.parseFrom(byteBuffer);
    }

    public static cm_1 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (cm_1)f.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static cm_1 a(ByteString byteString) {
        return (cm_1)f.parseFrom(byteString);
    }

    public static cm_1 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (cm_1)f.parseFrom(byteString, extensionRegistryLite);
    }

    public static cm_1 a(byte[] byArray) {
        return (cm_1)f.parseFrom(byArray);
    }

    public static cm_1 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (cm_1)f.parseFrom(byArray, extensionRegistryLite);
    }

    public static cm_1 a(InputStream inputStream) {
        return (cm_1)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream);
    }

    public static cm_1 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cm_1)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static cm_1 b(InputStream inputStream) {
        return (cm_1)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream);
    }

    public static cm_1 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cm_1)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static cm_1 a(CodedInputStream codedInputStream) {
        return (cm_1)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream);
    }

    public static cm_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cm_1)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public co_2 e() {
        return cm_1.f();
    }

    public static co_2 f() {
        return e.g();
    }

    public static co_2 a(cm_1 cm_12) {
        return e.g().a(cm_12);
    }

    public co_2 g() {
        return this == e ? new co_2() : new co_2().a(this);
    }

    protected co_2 a(GeneratedMessageV3.BuilderParent builderParent) {
        co_2 co_22 = new co_2(builderParent);
        return co_22;
    }

    public static cm_1 h() {
        return e;
    }

    public static Parser<cm_1> i() {
        return f;
    }

    public Parser<cm_1> getParserForType() {
        return f;
    }

    public cm_1 j() {
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

    static /* synthetic */ UnknownFieldSet b(cm_1 cm_12) {
        return cm_12.unknownFields;
    }
}

