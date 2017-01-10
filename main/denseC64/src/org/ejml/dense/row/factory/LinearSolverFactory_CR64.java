/*
 * Copyright (c) 2009-2017, Peter Abeles. All Rights Reserved.
 *
 * This file is part of Efficient Java Matrix Library (EJML).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ejml.dense.row.factory;

import org.ejml.data.DMatrixRow_C64;
import org.ejml.dense.row.decompose.chol.CholeskyDecompositionInner_CR64;
import org.ejml.dense.row.decompose.lu.LUDecompositionAlt_CR64;
import org.ejml.dense.row.linsol.chol.LinearSolverChol_CR64;
import org.ejml.dense.row.linsol.lu.LinearSolverLu_CR64;
import org.ejml.dense.row.linsol.qr.LinearSolverQrHouseCol_CR64;
import org.ejml.interfaces.linsol.LinearSolver;

/**
 * Factory for creating linear solvers of complex matrices
 *
 * @author Peter Abeles
 */
public class LinearSolverFactory_CR64 {

    /**
     * Creates a linear solver which uses LU decomposition internally
     *
     * @param matrixSize Approximate of rows and columns
     * @return Linear solver
     */
    public static LinearSolver<DMatrixRow_C64> lu(int matrixSize ) {
        return new LinearSolverLu_CR64(new LUDecompositionAlt_CR64());
    }

    /**
     * Creates a linear solver which uses Cholesky decomposition internally
     *
     * @param matrixSize Approximate of rows and columns
     * @return Linear solver
     */
    public static LinearSolver<DMatrixRow_C64> chol(int matrixSize ) {
        return new LinearSolverChol_CR64(new CholeskyDecompositionInner_CR64());
    }

    /**
     * Creates a linear solver which uses QR decomposition internally
     *
     * @param numRows Approximate of rows
     * @param numCols Approximate of columns
     * @return Linear solver
     */
    public static LinearSolver<DMatrixRow_C64> qr(int numRows , int numCols ) {
        return new LinearSolverQrHouseCol_CR64();
    }
}