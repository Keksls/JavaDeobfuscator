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
 * Renamed from gB
 */
public final class gb_2
extends GeneratedMessageV3.Builder<gb_2>
implements gc_2 {
    private int a;
    private List<gv_1> b = Collections.emptyList();
    private RepeatedFieldBuilderV3<gv_1, gx_1, gy_1> c;
    private boolean d;
    private boolean e;

    public static final Descriptors.Descriptor a() {
        return gt_1.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return gt_1.b.ensureFieldAccessorsInitialized(gz_1.class, gb_2.class);
    }

    gb_2() {
        this.s();
    }

    gb_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.s();
    }

    private void s() {
        if (gz_1.o()) {
            this.u();
        }
    }

    public gb_2 i() {
        super.clear();
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
        } else {
            this.c.clear();
        }
        this.d = false;
        this.a &= 0xFFFFFFFD;
        this.e = false;
        this.a &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return gt_1.a;
    }

    public gz_1 j() {
        return gz_1.l();
    }

    public gz_1 k() {
        gz_1 gz_12 = this.l();
        if (!gz_12.isInitialized()) {
            throw gb_2.newUninitializedMessageException((Message)gz_12);
        }
        return gz_12;
    }

    public gz_1 l() {
        gz_1 gz_12 = new gz_1(this);
        int n = this.a;
        int n2 = 0;
        if (this.c == null) {
            if ((this.a & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
                this.a &= 0xFFFFFFFE;
            }
            gz_12.g = this.b;
        } else {
            gz_12.g = this.c.build();
        }
        if ((n & 2) == 2) {
            n2 |= 1;
        }
        gz_12.h = this.d;
        if ((n & 4) == 4) {
            n2 |= 2;
        }
        gz_12.i = this.e;
        gz_12.f = n2;
        this.onBuilt();
        return gz_12;
    }

    public gb_2 m() {
        return (gb_2)super.clone();
    }

    public gb_2 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (gb_2)super.setField(fieldDescriptor, object);
    }

    public gb_2 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (gb_2)super.clearField(fieldDescriptor);
    }

    public gb_2 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (gb_2)super.clearOneof(oneofDescriptor);
    }

    public gb_2 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (gb_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public gb_2 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (gb_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public gb_2 a(Message message) {
        if (message instanceof gz_1) {
            return this.a((gz_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public gb_2 a(gz_1 gz_12) {
        if (gz_12 == gz_1.l()) {
            return this;
        }
        if (this.c == null) {
            if (!gz_12.g.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = gz_12.g;
                    this.a &= 0xFFFFFFFE;
                } else {
                    this.t();
                    this.b.addAll(gz_12.g);
                }
                this.onChanged();
            }
        } else if (!gz_12.g.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c.dispose();
                this.c = null;
                this.b = gz_12.g;
                this.a &= 0xFFFFFFFE;
                this.c = gz_1.p() ? this.u() : null;
            } else {
                this.c.addAllMessages(gz_12.g);
            }
        }
        if (gz_12.e()) {
            this.a(gz_12.f());
        }
        if (gz_12.g()) {
            this.b(gz_12.h());
        }
        this.b(gz_1.b(gz_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.e()) {
            return false;
        }
        if (!this.g()) {
            return false;
        }
        for (int k = 0; k < this.d(); ++k) {
            if (this.a(k).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public gb_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        gz_1 gz_12 = null;
        try {
            gz_12 = (gz_1)gz_1.d.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            gz_12 = (gz_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (gz_12 != null) {
                this.a(gz_12);
            }
        }
        return this;
    }

    private void t() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<gv_1>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<gv_1> b() {
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
    public gv_1 a(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (gv_1)this.c.getMessage(n);
    }

    public gb_2 a(int n, gv_1 gv_12) {
        if (this.c == null) {
            if (gv_12 == null) {
                throw new NullPointerException();
            }
            this.t();
            this.b.set(n, gv_12);
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)gv_12);
        }
        return this;
    }

    public gb_2 a(int n, gx_1 gx_12) {
        if (this.c == null) {
            this.t();
            this.b.set(n, gx_12.j());
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)gx_12.j());
        }
        return this;
    }

    public gb_2 a(gv_1 gv_12) {
        if (this.c == null) {
            if (gv_12 == null) {
                throw new NullPointerException();
            }
            this.t();
            this.b.add(gv_12);
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)gv_12);
        }
        return this;
    }

    public gb_2 b(int n, gv_1 gv_12) {
        if (this.c == null) {
            if (gv_12 == null) {
                throw new NullPointerException();
            }
            this.t();
            this.b.add(n, gv_12);
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)gv_12);
        }
        return this;
    }

    public gb_2 a(gx_1 gx_12) {
        if (this.c == null) {
            this.t();
            this.b.add(gx_12.j());
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)gx_12.j());
        }
        return this;
    }

    public gb_2 b(int n, gx_1 gx_12) {
        if (this.c == null) {
            this.t();
            this.b.add(n, gx_12.j());
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)gx_12.j());
        }
        return this;
    }

    public gb_2 a(Iterable<? extends gv_1> iterable) {
        if (this.c == null) {
            this.t();
            AbstractMessageLite.Builder.addAll(iterable, this.b);
            this.onChanged();
        } else {
            this.c.addAllMessages(iterable);
        }
        return this;
    }

    public gb_2 n() {
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.c.clear();
        }
        return this;
    }

    public gb_2 c(int n) {
        if (this.c == null) {
            this.t();
            this.b.remove(n);
            this.onChanged();
        } else {
            this.c.remove(n);
        }
        return this;
    }

    public gx_1 d(int n) {
        return (gx_1)this.u().getBuilder(n);
    }

    @Override
    public gy_1 b(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (gy_1)this.c.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends gy_1> c() {
        if (this.c != null) {
            return this.c.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.b);
    }

    public gx_1 o() {
        return (gx_1)this.u().addBuilder((AbstractMessage)gv_1.k());
    }

    public gx_1 e(int n) {
        return (gx_1)this.u().addBuilder(n, (AbstractMessage)gv_1.k());
    }

    public List<gx_1> p() {
        return this.u().getBuilderList();
    }

    private RepeatedFieldBuilderV3<gv_1, gx_1, gy_1> u() {
        if (this.c == null) {
            this.c = new RepeatedFieldBuilderV3(this.b, (this.a & 1) == 1, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    @Override
    public boolean e() {
        return (this.a & 2) == 2;
    }

    @Override
    public boolean f() {
        return this.d;
    }

    public gb_2 a(boolean bl) {
        this.a |= 2;
        this.d = bl;
        this.onChanged();
        return this;
    }

    public gb_2 q() {
        this.a &= 0xFFFFFFFD;
        this.d = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean g() {
        return (this.a & 4) == 4;
    }

    @Override
    public boolean h() {
        return this.e;
    }

    public gb_2 b(boolean bl) {
        this.a |= 4;
        this.e = bl;
        this.onChanged();
        return this;
    }

    public gb_2 r() {
        this.a &= 0xFFFFFFFB;
        this.e = false;
        this.onChanged();
        return this;
    }

    public final gb_2 a(UnknownFieldSet unknownFieldSet) {
        return (gb_2)super.setUnknownFields(unknownFieldSet);
    }

    public final gb_2 b(UnknownFieldSet unknownFieldSet) {
        return (gb_2)super.mergeUnknownFields(unknownFieldSet);
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
        return this.i();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.m();
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
        return this.i();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.m();
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
        return this.m();
    }

    public /* synthetic */ Message buildPartial() {
        return this.l();
    }

    public /* synthetic */ Message build() {
        return this.k();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.i();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.m();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.l();
    }

    public /* synthetic */ MessageLite build() {
        return this.k();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.i();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.j();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.j();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.m();
    }

    public /* synthetic */ Object clone() {
        return this.m();
    }
}

