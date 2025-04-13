/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.SingleFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from cC
 */
public final class cc_1
extends GeneratedMessageV3.Builder<cc_1>
implements cd_1 {
    private long a;
    private bo_1 b = null;
    private SingleFieldBuilderV3<bo_1, bq_1, br_1> c;

    public static final Descriptors.Descriptor a() {
        return ak_2.K;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.L.ensureFieldAccessorsInitialized(ca_1.class, cc_1.class);
    }

    cc_1() {
        this.n();
    }

    cc_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.n();
    }

    private void n() {
        if (ca_1.l()) {
            // empty if block
        }
    }

    public cc_1 f() {
        super.clear();
        this.a = 0L;
        if (this.c == null) {
            this.b = null;
        } else {
            this.b = null;
            this.c = null;
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ak_2.K;
    }

    public ca_1 g() {
        return ca_1.i();
    }

    public ca_1 h() {
        ca_1 ca_12 = this.i();
        if (!ca_12.isInitialized()) {
            throw cc_1.newUninitializedMessageException((Message)ca_12);
        }
        return ca_12;
    }

    public ca_1 i() {
        ca_1 ca_12 = new ca_1(this);
        ca_12.d = this.a;
        ca_12.e = this.c == null ? this.b : (bo_1)this.c.build();
        this.onBuilt();
        return ca_12;
    }

    public cc_1 j() {
        return (cc_1)super.clone();
    }

    public cc_1 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (cc_1)super.setField(fieldDescriptor, object);
    }

    public cc_1 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (cc_1)super.clearField(fieldDescriptor);
    }

    public cc_1 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (cc_1)super.clearOneof(oneofDescriptor);
    }

    public cc_1 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (cc_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public cc_1 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (cc_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public cc_1 a(Message message) {
        if (message instanceof ca_1) {
            return this.a((ca_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public cc_1 a(ca_1 ca_12) {
        if (ca_12 == ca_1.i()) {
            return this;
        }
        if (ca_12.b() != 0L) {
            this.a(ca_12.b());
        }
        if (ca_12.c()) {
            this.b(ca_12.d());
        }
        this.b(ca_1.b(ca_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public cc_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ca_1 ca_12 = null;
        try {
            ca_12 = (ca_1)ca_1.h.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ca_12 = (ca_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ca_12 != null) {
                this.a(ca_12);
            }
        }
        return this;
    }

    @Override
    public long b() {
        return this.a;
    }

    public cc_1 a(long l) {
        this.a = l;
        this.onChanged();
        return this;
    }

    public cc_1 k() {
        this.a = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean c() {
        return this.c != null || this.b != null;
    }

    @Override
    public bo_1 d() {
        if (this.c == null) {
            return this.b == null ? bo_1.g() : this.b;
        }
        return (bo_1)this.c.getMessage();
    }

    public cc_1 a(bo_1 bo_12) {
        if (this.c == null) {
            if (bo_12 == null) {
                throw new NullPointerException();
            }
            this.b = bo_12;
            this.onChanged();
        } else {
            this.c.setMessage((AbstractMessage)bo_12);
        }
        return this;
    }

    public cc_1 a(bq_1 bq_12) {
        if (this.c == null) {
            this.b = bq_12.f();
            this.onChanged();
        } else {
            this.c.setMessage((AbstractMessage)bq_12.f());
        }
        return this;
    }

    public cc_1 b(bo_1 bo_12) {
        if (this.c == null) {
            this.b = this.b != null ? bo_1.a(this.b).a(bo_12).g() : bo_12;
            this.onChanged();
        } else {
            this.c.mergeFrom((AbstractMessage)bo_12);
        }
        return this;
    }

    public cc_1 l() {
        if (this.c == null) {
            this.b = null;
            this.onChanged();
        } else {
            this.b = null;
            this.c = null;
        }
        return this;
    }

    public bq_1 m() {
        this.onChanged();
        return (bq_1)this.o().getBuilder();
    }

    @Override
    public br_1 e() {
        if (this.c != null) {
            return (br_1)this.c.getMessageOrBuilder();
        }
        return this.b == null ? bo_1.g() : this.b;
    }

    private SingleFieldBuilderV3<bo_1, bq_1, br_1> o() {
        if (this.c == null) {
            this.c = new SingleFieldBuilderV3((AbstractMessage)this.d(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    public final cc_1 a(UnknownFieldSet unknownFieldSet) {
        return (cc_1)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final cc_1 b(UnknownFieldSet unknownFieldSet) {
        return (cc_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.f();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.j();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.f();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.j();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.j();
    }

    public /* synthetic */ Message buildPartial() {
        return this.i();
    }

    public /* synthetic */ Message build() {
        return this.h();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.f();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.j();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.i();
    }

    public /* synthetic */ MessageLite build() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.f();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.g();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.g();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.j();
    }

    public /* synthetic */ Object clone() {
        return this.j();
    }
}

