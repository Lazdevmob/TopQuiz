package com.OCR.Laz.TopQuiz.model;

import java.util.Collections;
import java.util.List;

/**
 * Created by Lazdev OCR on 18/05/2021.
 */

    public class QuestionBank {
        private List<Question> mQuestionList;
        private int mNextQuestionIndex;

        public QuestionBank(List<Question> questionList) {
            mQuestionList = questionList;

            // Shuffle the question list
            Collections.shuffle(mQuestionList);

            mNextQuestionIndex = 0;
        }

        public Question getQuestion_b() {
            // Ensure we loop over the questions
            if (mNextQuestionIndex == mQuestionList.size()) {
                mNextQuestionIndex = 0;
            }

            // Please note the post-incrementation
            return mQuestionList.get(mNextQuestionIndex++);
        }
    }
