import React, { useState } from "react";

export default function App() {
    const questions = [
        {
            questionText: "What is the capital of India?",
            answerOptions: [
                { answerText: "New York", isCorrect: false },
                { answerText: "London", isCorrect: false },
                { answerText: "New Delhi", isCorrect: true },
                { answerText: "Dublin", isCorrect: false },
            ],
        },
        {
            questionText: "What is the capital of Germany?",
            answerOptions: [
                { answerText: "Delhi", isCorrect: false },
                { answerText: "Berlin", isCorrect: true },
                { answerText: "Bill Paris", isCorrect: false },
                { answerText: "London", isCorrect: false },
            ],
        },
        {
            questionText: "What is the capital of France?",
            answerOptions: [
                { answerText: "Paris", isCorrect: true },
                { answerText: "Berlin", isCorrect: false },
                { answerText: "Delhi", isCorrect: false },
                { answerText: "London", isCorrect: false },
            ],
        },
        {
            questionText: "What is the capital of England?",
            answerOptions: [
                { answerText: "Paris", isCorrect: false },
                { answerText: "Berlin", isCorrect: false },
                { answerText: "Delhi", isCorrect: false },
                { answerText: "London", isCorrect: true },
            ],
        },
        {
            questionText: "What is the capital of USA?",
            answerOptions: [
                { answerText: "London", isCorrect: false },
                { answerText: "Delhi", isCorrect: false },
                { answerText: "Paris", isCorrect: false },
                { answerText: "Washington", isCorrect: true },
            ],
        },
    ];

    const [currentQuestion, setCurrentQuestion] = useState(0);
    const [showScore, setShowScore] = useState(false);
    const [score, setScore] = useState(0);

    const handleAnswerOptionClick = (isCorrect) => {
        if (isCorrect) {
            setScore(score + 1);
        }

        const nextQuestion = currentQuestion + 1;
        if (nextQuestion < questions.length) {
            setCurrentQuestion(nextQuestion);
        } else {
            setShowScore(true);
        }
    };
    return (
        <div className="app">
            {showScore ? (
                <div className="score-section">
                    You scored {score} out of {questions.length}
                </div>
            ) : (
                <>
                    <div className="question-section">
                        <div className="question-count">
                            <span>Question {currentQuestion + 1}</span>/
                            {questions.length}
                        </div>
                        <div className="question-text">
                            {questions[currentQuestion].questionText}
                        </div>
                    </div>
                    <div className="answer-section">
                        {questions[currentQuestion].answerOptions.map(
                            (answerOption) => (
                                <button
                                    onClick={() =>
                                        handleAnswerOptionClick(
                                            answerOption.isCorrect
                                        )
                                    }
                                >
                                    {answerOption.answerText}
                                </button>
                            )
                        )}
                    </div>
                </>
            )}
        </div>
    );
}
