package com.ryaltech.spark.envelope;

import java.util.List;

import org.apache.spark.sql.Dataset;

import com.cloudera.labs.envelope.output.LogOutput;
import com.cloudera.labs.envelope.plan.MutationType;

import scala.Tuple2;

public class FailingOutput extends LogOutput {

	@Override
	public void applyBulkMutations(List<Tuple2<MutationType, Dataset<org.apache.spark.sql.Row>>> planned) {
		// TODO Auto-generated method stub
		super.applyBulkMutations(planned);
	}
}
