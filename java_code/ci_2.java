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
 * Renamed from ci
 */
public final class ci_2
extends GeneratedMessageV3.Builder<ci_2>
implements cj_2 {
    private long a;
    private cd_2 b = null;
    private SingleFieldBuilderV3<cd_2, cf_2, cq_1> c;

    public static final Descriptors.Descriptor a() {
        return ak_2.O;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.P.ensureFieldAccessorsInitialized(cg_1.class, ci_2.class);
    }

    ci_2() {
        this.n();
    }

    ci_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.n();
    }

    private void n() {
        if (cg_1.l()) {
            // empty if block
        }
    }

    public ci_2 f() {
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
        return ak_2.O;
    }

    public cg_1 g() {
        return cg_1.i();
    }

    public cg_1 h() {
        cg_1 cg_12 = this.i();
        if (!cg_12.isInitialized()) {
            throw ci_2.newUninitializedMessageException((Message)cg_12);
        }
        return cg_12;
    }

    public cg_1 i() {
        cg_1 cg_12 = new cg_1(this);
        cg_12.d = this.a;
        cg_12.e = this.c == null ? this.b : (cd_2)this.c.build();
        this.onBuilt();
        return cg_12;
    }

    public ci_2 j() {
        return (ci_2)super.clone();
    }

    public ci_2 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ci_2)super.setField(fieldDescriptor, object);
    }

    public ci_2 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ci_2)super.clearField(fieldDescriptor);
    }

    public ci_2 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ci_2)super.clearOneof(oneofDescriptor);
    }

    public ci_2 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ci_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ci_2 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ci_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public ci_2 a(Message message) {
        if (message instanceof cg_1) {
            return this.a((cg_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ci_2 a(cg_1 cg_12) {
        if (cg_12 == cg_1.i()) {
            return this;
        }
        if (cg_12.b() != 0L) {
            this.a(cg_12.b());
        }
        if (cg_12.c()) {
            this.b(cg_12.d());
        }
        this.b(cg_1.b(cg_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public ci_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        cg_1 cg_12 = null;
        try {
            cg_12 = (cg_1)cg_1.h.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            cg_12 = (cg_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (cg_12 != null) {
                this.a(cg_12);
            }
        }
        return this;
    }

    @Override
    public long b() {
        return this.a;
    }

    public ci_2 a(long l) {
        this.a = l;
        this.onChanged();
        return this;
    }

    public ci_2 k() {
        this.a = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean c() {
        return this.c != null || this.b != null;
    }

    @Override
    public cd_2 d() {
        if (this.c == null) {
            return this.b == null ? cd_2.j() : this.b;
        }
        return (cd_2)this.c.getMessage();
    }

    public ci_2 a(cd_2 cd_22) {
        if (this.c == null) {
            if (cd_22 == null) {
                throw new NullPointerException();
            }
            this.b = cd_22;
            this.onChanged();
        } else {
            this.c.setMessage((AbstractMessage)cd_22);
        }
        return this;
    }

    public ci_2 a(cf_2 cf_22) {
        if (this.c == null) {
            this.b = cf_22.i();
            this.onChanged();
        } else {
            this.c.setMessage((AbstractMessage)cf_22.i());
        }
        return this;
    }

    public ci_2 b(cd_2 cd_22) {
        if (this.c == null) {
            this.b = this.b != null ? cd_2.a(this.b).a(cd_22).j() : cd_22;
            this.onChanged();
        } else {
            this.c.mergeFrom((AbstractMessage)cd_22);
        }
        return this;
    }

    public ci_2 l() {
        if (this.c == null) {
            this.b = null;
            this.onChanged();
        } else {
            this.b = null;
            this.c = null;
        }
        return this;
    }

    public cf_2 m() {
        this.onChanged();
        return (cf_2)this.o().getBuilder();
    }

    @Override
    public cq_1 e() {
        if (this.c != null) {
            return (cq_1)this.c.getMessageOrBuilder();
        }
        return this.b == null ? cd_2.j() : this.b;
    }

    private SingleFieldBuilderV3<cd_2, cf_2, cq_1> o() {
        if (this.c == null) {
            this.c = new SingleFieldBuilderV3((AbstractMessage)this.d(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    public final ci_2 a(UnknownFieldSet unknownFieldSet) {
        return (ci_2)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final ci_2 b(UnknownFieldSet unknownFieldSet) {
        return (ci_2)super.mergeUnknownFields(unknownFieldSet);
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

