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
 *  com.google.protobuf.RepeatedFieldBuilderV3
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from cO
 */
public final class co_2
extends GeneratedMessageV3.Builder<co_2>
implements cp_2 {
    private int a;
    private List<cd_2> b = Collections.emptyList();
    private RepeatedFieldBuilderV3<cd_2, cf_2, cq_1> c;

    public static final Descriptors.Descriptor a() {
        return ak_2.ac;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.ad.ensureFieldAccessorsInitialized(cm_1.class, co_2.class);
    }

    co_2() {
        this.m();
    }

    co_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.m();
    }

    private void m() {
        if (cm_1.k()) {
            this.o();
        }
    }

    public co_2 e() {
        super.clear();
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
        } else {
            this.c.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ak_2.ac;
    }

    public cm_1 f() {
        return cm_1.h();
    }

    public cm_1 g() {
        cm_1 cm_12 = this.h();
        if (!cm_12.isInitialized()) {
            throw co_2.newUninitializedMessageException((Message)cm_12);
        }
        return cm_12;
    }

    public cm_1 h() {
        cm_1 cm_12 = new cm_1(this);
        int n = this.a;
        if (this.c == null) {
            if ((this.a & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
                this.a &= 0xFFFFFFFE;
            }
            cm_12.c = this.b;
        } else {
            cm_12.c = this.c.build();
        }
        this.onBuilt();
        return cm_12;
    }

    public co_2 i() {
        return (co_2)super.clone();
    }

    public co_2 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (co_2)super.setField(fieldDescriptor, object);
    }

    public co_2 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (co_2)super.clearField(fieldDescriptor);
    }

    public co_2 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (co_2)super.clearOneof(oneofDescriptor);
    }

    public co_2 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (co_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public co_2 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (co_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public co_2 a(Message message) {
        if (message instanceof cm_1) {
            return this.a((cm_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public co_2 a(cm_1 cm_12) {
        if (cm_12 == cm_1.h()) {
            return this;
        }
        if (this.c == null) {
            if (!cm_12.c.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = cm_12.c;
                    this.a &= 0xFFFFFFFE;
                } else {
                    this.n();
                    this.b.addAll(cm_12.c);
                }
                this.onChanged();
            }
        } else if (!cm_12.c.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c.dispose();
                this.c = null;
                this.b = cm_12.c;
                this.a &= 0xFFFFFFFE;
                this.c = cm_1.l() ? this.o() : null;
            } else {
                this.c.addAllMessages(cm_12.c);
            }
        }
        this.b(cm_1.b(cm_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public co_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        cm_1 cm_12 = null;
        try {
            cm_12 = (cm_1)cm_1.f.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            cm_12 = (cm_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (cm_12 != null) {
                this.a(cm_12);
            }
        }
        return this;
    }

    private void n() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<cd_2>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<cd_2> b() {
        if (this.c == null) {
            return Collections.unmodifiableList(this.b);
        }
        return this.c.getMessageList();
    }

    @Override
    public int d() {
        if (this.c == null) {
            return this.b.size();
        }
        return this.c.getCount();
    }

    @Override
    public cd_2 a(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (cd_2)this.c.getMessage(n);
    }

    public co_2 a(int n, cd_2 cd_22) {
        if (this.c == null) {
            if (cd_22 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.set(n, cd_22);
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)cd_22);
        }
        return this;
    }

    public co_2 a(int n, cf_2 cf_22) {
        if (this.c == null) {
            this.n();
            this.b.set(n, cf_22.i());
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)cf_22.i());
        }
        return this;
    }

    public co_2 a(cd_2 cd_22) {
        if (this.c == null) {
            if (cd_22 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(cd_22);
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)cd_22);
        }
        return this;
    }

    public co_2 b(int n, cd_2 cd_22) {
        if (this.c == null) {
            if (cd_22 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(n, cd_22);
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)cd_22);
        }
        return this;
    }

    public co_2 a(cf_2 cf_22) {
        if (this.c == null) {
            this.n();
            this.b.add(cf_22.i());
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)cf_22.i());
        }
        return this;
    }

    public co_2 b(int n, cf_2 cf_22) {
        if (this.c == null) {
            this.n();
            this.b.add(n, cf_22.i());
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)cf_22.i());
        }
        return this;
    }

    public co_2 a(Iterable<? extends cd_2> iterable) {
        if (this.c == null) {
            this.n();
            AbstractMessageLite.Builder.addAll(iterable, this.b);
            this.onChanged();
        } else {
            this.c.addAllMessages(iterable);
        }
        return this;
    }

    public co_2 j() {
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.c.clear();
        }
        return this;
    }

    public co_2 c(int n) {
        if (this.c == null) {
            this.n();
            this.b.remove(n);
            this.onChanged();
        } else {
            this.c.remove(n);
        }
        return this;
    }

    public cf_2 d(int n) {
        return (cf_2)this.o().getBuilder(n);
    }

    @Override
    public cq_1 b(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (cq_1)this.c.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends cq_1> c() {
        if (this.c != null) {
            return this.c.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.b);
    }

    public cf_2 k() {
        return (cf_2)this.o().addBuilder((AbstractMessage)cd_2.j());
    }

    public cf_2 e(int n) {
        return (cf_2)this.o().addBuilder(n, (AbstractMessage)cd_2.j());
    }

    public List<cf_2> l() {
        return this.o().getBuilderList();
    }

    private RepeatedFieldBuilderV3<cd_2, cf_2, cq_1> o() {
        if (this.c == null) {
            this.c = new RepeatedFieldBuilderV3(this.b, (this.a & 1) == 1, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    public final co_2 a(UnknownFieldSet unknownFieldSet) {
        return (co_2)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final co_2 b(UnknownFieldSet unknownFieldSet) {
        return (co_2)super.mergeUnknownFields(unknownFieldSet);
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
        return this.e();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.i();
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
        return this.e();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.i();
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
        return this.i();
    }

    public /* synthetic */ Message buildPartial() {
        return this.h();
    }

    public /* synthetic */ Message build() {
        return this.g();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.h();
    }

    public /* synthetic */ MessageLite build() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ Object clone() {
        return this.i();
    }
}

